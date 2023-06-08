import Display.*;
import Function.*;
import Module.*;
import IO.*;

import static IO.TransactionProcessing.*;


public class Manage {
    private final Menu menu;
    private final CheckInputSystem data;
    private final ControlUser controlUser;
    private final ControlStoreBook controlStoreBook;


    public Manage() { // tạo 1 controluser để test
        menu = new Menu();
        data = new CheckInputSystem();
        this.controlUser = new ControlUser(readToFileUser(TransactionProcessing.linkUser));
        this.controlStoreBook=new ControlStoreBook();
    }

    public void start() {
        while (true) {
            System.out.println(menu.showMenuBegin());
            switch (data.inputNumber()) {
                case 1:
                    controlUser.login();
                    if (controlUser.checkClient(controlUser.getUser())) {
                        functionClient(controlUser.getUser());
                    } else if (controlUser.checkStaff(controlUser.getUser())) {
                        functionStaff(controlUser.getUser());
                    } else if (controlUser.checkManager(controlUser.getUser())) {
                        functionManager(controlUser.getUser());
                    } else
                        System.out.println(menu.brainFish());
                    break;
                case 2:
                    controlUser.createClient(controlUser.createUser());
                    System.out.println(menu.completeRegeiter());
                    break;
                case 3:
                    return;
                default:
                    System.out.println(menu.userNoBrain());
            }
        }
    }

    public void functionClient(User user) {
        String nameUser = user.getName();
        while (true) {
            System.out.println(menu.menuFunctionClient(nameUser));
            switch (data.inputNumber()) {
                case 1:
                    functionYourUser(user);
                    break;
                case 2:// list book mua
                    break;
                case 3:// mua online
                    break;
                case 4:
                    writeToFileUser(linkUser,controlUser.getList());
                    controlUser.logout();
                    return;
                default:
                    System.out.println(menu.userNoBrain());
            }
        }
    }

    public void functionStaff(User user) {
        String nameUser = user.getName();
        while (true) {
            System.out.println(menu.menuFunctionStaff(nameUser));
            switch (data.inputNumber()) {
                case 1:
                    functionYourUser(user);
                    break;
                case 2:
                    functionCRUDClient(user);
                    break;
                case 3:// tạo bill
                    break;
                case 4:
                    writeToFileUser(linkUser,controlUser.getList());
                    controlUser.logout();
                    return;
                default:
                    System.out.println(menu.userNoBrain());
            }
        }
    }

    public void functionManager(User user) {
        String nameUser = user.getName();
        while (true) {
            System.out.println(menu.menuFunctionManager(nameUser));
            switch (data.inputNumber()) {
                case 1:
                    functionYourUser(user);
                    break;
                case 2:
                    functionCRUDClient(user);
                    break;
                case 3:
                    functionCRUDStaff(user);
                    break;
                case 4://chưa làm đc bill
                    break;
                case 5://chưa làm đc sách
                    break;
                case 6:// logout and save
                    writeToFileUser(linkUser,controlUser.getList());
                    controlUser.logout();
                    return;
                default:
                    System.out.println(menu.userNoBrain());
            }
        }

    }

    public void functionYourUser(User user) {
        String nameUser = user.getName();
        while (true) {
            System.out.println(menu.infoYourAccount(nameUser));
            switch (data.inputNumber()) {
                case 1: //show info bản thân
                    System.out.println(controlUser.getUser().toString());
                    break;
                case 2: // sửa pass
                    System.out.println(controlUser.editPass(user));
                    break;
                case 3:// sửa tên
                    System.out.println(controlUser.editName(user));
                    break;
                case 4: // thoát
                    return;
                default:
                    System.out.println(menu.userNoBrain());
            }
        }
    }

    public void functionCRUDClient(User user) {
        String nameUser = user.getName();
        while (true) {
            System.out.println(menu.menuManagerCRUD(nameUser, "Client"));
            switch (data.inputNumber()) {
                case 1: // hiển thị list khách
                    System.out.println( controlUser.showListClient());
                    break;
                case 2: // tạo user khách
                    controlUser.add(controlUser.createClient(controlUser.createUser()));
                    break;
                case 3:// edit = id
                    System.out.println(menu.menuEditClient(nameUser));
                    controlUser.edit(controlUser.findById(),data.inputNumber());
                    break;
                case 4: // xóa tài khoản search id or phone (có thể tách ra để tường minh)
                    System.out.println(menu.showTypeSearch());
                    int pickType = data.inputNumber();
                    if (pickType == 1) { // bằng id
                        controlUser.delete(controlUser.findById());
                    } else if (pickType == 2) {// bằng email
                        controlUser.delete(controlUser.findByEmail());
                    } else if (pickType == 3) {//bằng phone
                        controlUser.delete(controlUser.findByPhone());
                    }
                    System.out.println(menu.userNoBrain());
                    break;
                case 5:
                    return;
                default:
                    System.out.println(menu.userNoBrain());
            }
        }
    }
    public void functionCRUDStaff(User user) {
        String nameUser = user.getName();
        while (true) {
            System.out.println(menu.menuManagerCRUD(nameUser, "Staff"));
            switch (data.inputNumber()) {
                case 1: // hiển thị list nv
                    System.out.println(controlUser.showListStaff());
                    break;
                case 2: // tạo user khách
                    controlUser.add(controlUser.createStaff(controlUser.createUser()));
                    break;
                case 3:// edit = id
                    System.out.println(menu.menuEditStaff(nameUser));
                    controlUser.edit(controlUser.findById(),data.inputNumber());
                    break;
                case 4: // xóa tài khoản search id or phone (có thể tách ra để tường minh)
                    System.out.println(menu.showTypeSearch());
                    int pickType = data.inputNumber();
                    if (pickType == 1) { // bằng id
                        controlUser.delete(controlUser.findById());
                    } else if (pickType == 2) {// bằng email
                        controlUser.delete(controlUser.findByEmail());
                    } else if (pickType == 3) {//bằng phone
                        controlUser.delete(controlUser.findByPhone());
                    }
                    System.out.println(menu.userNoBrain());
                    break;
                case 5:
                    return;
                default:
                    System.out.println(menu.userNoBrain());
            }
        }
    }


}