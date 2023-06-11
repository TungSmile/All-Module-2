package Function;

import Display.*;
import Module.*;
import IO.*;

import java.util.ArrayList;

import static Display.Menu.menuEditStaff;
import static IO.TransactionProcessing.*;


public class Manage {
    private final Menu menu;
    private final CheckInputSystem data;
    public final ControlUser controlUser;
    private final ControlStoreBook controlStoreBook;


    public Manage() { // tạo 1 controluser để test
        menu = new Menu();
        data = new CheckInputSystem();
        this.controlUser = new ControlUser(readToFileUser(TransactionProcessing.linkUser));
        this.controlStoreBook = new ControlStoreBook(readToFileBook(linkBook), readToFileBill(linkBill));
    }

    public void start() {
        while (true) {
            System.out.println(menu.showMenuBegin());
            switch (data.inputNumber()) {
                case 1:
                    User user = controlUser.login();
                    int number = controlUser.checkAuthority(user);
                    if (number < 2) {
                        functionManager(user);
                    } else if (number < 3) {
                        functionStaff(user);
                    } else if (number < 4) {
                        functionClient(user);
                    } else System.out.println(menu.magicHappen());
                    break;
                case 2:
                    controlUser.add(controlUser.createClient(controlUser.createUser()));
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
                case 2:
                    Client temp = (Client) user;
                    ArrayList<Books> list = temp.getListBook();
                    for (Books books : list) {
                        System.out.println(books.toString());
                    }
                    break;
                case 3:
                    Client client=(Client) user;
                    controlStoreBook.buyOnline(client);
                    break;
                case 4:
                    writeToFileBook(linkBook, controlStoreBook.getListBook());
                    writeToFileUser(linkUser, controlUser.getList());
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
                case 3:
                    functionCRUDBill(user);
                    break;
                case 4:
                    writeToFileBill(linkBill, controlStoreBook.getListBill());
                    writeToFileBook(linkBook, controlStoreBook.getListBook());
                    writeToFileUser(linkUser, controlUser.getList());
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
                case 3: //
                    functionCRUDStaff(user);
                    break;
                case 4:// bill còn edit/del
                    functionCRUDBill(user);
                case 5:// book còn edit/del
                    functionCRUDBook(user);
                    break;
                case 6:// logout and save
                    writeToFileBill(linkBill, controlStoreBook.getListBill());
                    writeToFileBook(linkBook, controlStoreBook.getListBook());
                    writeToFileUser(linkUser, controlUser.getList());
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
                    System.out.println(controlUser.showListClient());
                    break;
                case 2: // tạo user khách
                    controlUser.add(controlUser.createClient(controlUser.createUser()));
                    break;
                case 3:// edit = id
                    System.out.println(menu.menuEditClient(nameUser));
                    controlUser.edit(controlUser.findById(), data.inputNumber());
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
                    controlUser.createStaff();
                    break;

                case 3:// edit = id
                    System.out.println(controlUser.showListStaff());
                    System.out.println(menuEditStaff(nameUser));
                    System.out.println("Nhập ID để xác định sửa");
                    controlUser.edit(controlUser.findById(), data.inputNumber());
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

    public void functionCRUDBill(User user) {
        String nameUser = user.getName();
        while (true) {
            System.out.println(menu.menuManagerCRUD(nameUser, "Bill"));
            switch (data.inputNumber()) {
                case 1:// hiển thị list bill
                    System.out.println(ControlStoreBook.showBill(controlStoreBook.getListBill()));
                    System.out.println("Tổng thu nhập từ store" +controlStoreBook.getBalance() );
                    break;
                case 2:// tạo bill
                    System.out.println(controlUser.showListClient());
                    System.out.println("Nhập ID khách");
                    User user1 = controlUser.findById();
                    if (controlUser.checkClient(user1)) {
                        controlStoreBook.add(controlStoreBook.createBill(controlUser.getUser().getName(), user1));
                    } else
                        System.out.println(menu.notAuthority());
                    break;
                case 3: //edit chưa xong
                    System.out.println(menu.menuEditBill(nameUser));

                    System.out.println(" chưa cập nhật");
                    break;
                case 4: // del chưa xong
                    System.out.println(" chưa cập nhật");
                    break;
                case 5:
                    return;
                default:
                    System.out.println(menu.userNoBrain());
            }
        }
    }

    public void functionCRUDBook(User user) {
        String nameUser = user.getName();
        while (true) {
            System.out.println(menu.menuManagerCRUD(nameUser, "Book"));
            switch (data.inputNumber()) {
                case 1:// hiển thị list bill
                    System.out.println(ControlStoreBook.showBook(controlStoreBook.getListBook()));
                    break;
                case 2:// tạo book
                    controlStoreBook.add(controlStoreBook.createBook());
                    break;
                case 3: //edit chưa xong
                    System.out.println(menu.menuEditBook(nameUser));
                    System.out.println(" chưa cập nhật");
                    break;
                case 4: // del chưa xong
                    System.out.println(" chưa cập nhật");
                    break;
                case 5:
                    return;
                default:
                    System.out.println(menu.userNoBrain());
            }
        }
    }
}