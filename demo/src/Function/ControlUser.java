package Function;

import Display.*;
import Module.*;

import java.util.ArrayList;


public class ControlUser {
    public ArrayList<User> list;
    private User user;
    private final CheckInputSystem data;
    private final Menu menu;

    public ControlUser(ArrayList<User> list) {
        this.list = list;
        this.data = new CheckInputSystem();
        this.menu = new Menu();
    }

    public ArrayList<User> getList() {
        return list;
    }

    public void setList(ArrayList<User> list) {
        this.list = list;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean checkId(String o) {
        for (User user : list) {
            if (user.getId().equals(o)) {
                System.out.println(menu.duplicape("ID"));
                return false;
            }
        }
        return true;
    }


    public boolean checkPhone(String o) {
        for (User user : list) {
            if (user.getEmail().equals(o)) {
                System.out.println(menu.duplicape("phone"));
                return false;
            }
        }
        return true;
    }

    public boolean checkAuthority(User user, User user1) {
        int rankUser = 4, rankUser1 = 4;
        if (user instanceof Manager) {
            rankUser = 1;
        } else if (user instanceof Staff) {
            rankUser = 2;
        } else if (user instanceof Client) {
            rankUser = 3;
        }
        if (user1 instanceof Manager) {
            rankUser1 = 1;
        } else if (user1 instanceof Staff) {
            rankUser1 = 2;
        } else if (user1 instanceof Client) {
            rankUser1 = 3;
        }
        return rankUser < rankUser1;
    }

    public int checkAuthority(User user) {//rút gọn xem đc ko
        if (user instanceof Manager) return 1;
        if (user instanceof Staff) return 2;
        if (user instanceof Client) return 3;
        if (user == null) return 4;
        return 0;
    }

    public boolean checkManager(User user) {
        try {
            return (user instanceof Manager);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean checkStaff(User user) {
        try {
            return (user instanceof Staff);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean checkClient(User user) {
        try {
            return (user instanceof Client);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public User createUser() { // if cuối đang ảo ma manager mà ko tạo đc staff
        String id = data.inputId();
        String pass = data.inputPass();
        String name = data.inputName();
        String phone = data.inputPhone();
        String email = data.inputEmail();
        if (id != null && pass != null && name != null && phone != null && email != null && checkId(id) && checkPhone(phone)) {
            if (getUser() == null) {
                User user = new Client(id, pass, name, phone, email, data.inputRank(0), 0);
                add(user);
                return user;
            }
            if (checkStaff(getUser()) || checkManager(getUser())) {
                User user = new Client(id, pass, name, phone, email);
                return user;
            }
            if (checkManager(getUser())) {
                User user = new Staff(id, pass, name, phone, email);
                return user;
            }
        }
        System.out.println(menu.userNoBrain());
        return null;
    }

    public User createClient(User user) { // xuất hiện null khi óc chó điền lỗi
        Client temp = (Client) user;
        if (checkAuthority(getUser(), user) || checkAuthority(user) == 4) {
            int numberPoint = data.inputNumber();
            temp.setPointBonus(numberPoint);
            temp.setRank(data.inputRank(numberPoint));
            return temp;
        } else if (checkClient(getUser()) || getUser() == null) {
            int numberPoint = 0;
            temp.setPointBonus(numberPoint);
            temp.setRank(data.inputRank(numberPoint));
            return temp;
        }

        System.out.println(menu.magicHappen());
        return null;
    }

    public Staff createStaff(User user) {
        if (checkManager(getUser())) {
            Staff temp = (Staff) user;
            temp.setHourWork(data.inputHourWork());
            temp.setRating(data.inputRating());
            temp.setSalary(data.inputSalary());
        }
        System.out.println(menu.notAuthority());
        return null;
    }

    public void add(User o) {
        if (o instanceof Client || o instanceof Staff) {
            list.add(o);
        }
    }

    public void edit(User o, int number) {
        while (true) {
            switch (number) {
                case 1:// đổi pass
                    System.out.println(editPass(o));
                    break;
                case 2:// đổi email
                    System.out.println(editEmail(o));
                    break;
                case 3:// đổi tên
                    System.out.println(editName(o));
                    break;
                case 4:// đổi hạng  fix
                    if (checkStaff(o)) {
                        System.out.println(editRating(o));
                        break;
                    }
                    editRank(o);
                    break;
                case 5:// sửa lương
                    if (checkStaff(o)) {
                        System.out.println(editSalary(o));
                        break;
                    }
                    System.out.println(editPointBonus(o));
                    break;
                case 6: // sửa giờ làm
                    if (checkStaff(o)) {
                        System.out.println(editHourWork(o));
                        break;
                    }
                    return;
                case 7:
                    if (checkStaff(o)) {
                        return;
                    }
                    System.out.println(menu.userNoBrain());
                    break;
                default:
                    System.out.println(menu.userNoBrain());
            }
        }
    }


    public void delete(User o) {
        if (checkAuthority(getUser(), o)) {
            this.list.remove(o);
            System.out.println("done del");
        } else System.out.println(menu.notAuthority());
    }

    public User findById() {
        String id = data.inputId();
        if (id != null) {
            for (User user : list) {
                if (user.getId().equals(id)) {
                    return user;
                }
            }
        }
        return null;
    }

    public User findByEmail() {
        String email = data.inputEmail();
        if (email != null) {
            for (User user : list) {
                if (user.getEmail().equals(email)) {
                    return user;
                }
            }
        }
        return null;
    }

    public User findByPhone() {
        String phone = data.inputPhone();
        if (phone != null) {
            for (User user : list) {
                if (user.getPhone().equals(phone)) {
                    return user;
                }
            }
        }
        return null;
    }

    public User findByPass() {
        String pass = data.inputPass();
        if (pass != null) {
            for (User user : list) {
                if (user.getPass().equals(pass)) {
                    return user;
                }
            }
        }
        return null;
    }

    public void login() {
        User user = findById();
        User user1 = findByPass();
        if (user.equals(user1)) {
            setUser(user);
        }
    }

    public void logout() {
        if (getUser() != null) {
            setUser(null);
        }
    }

    public String showListClient() {
        String head = "-----------List-Client-------------\n";
        StringBuilder client = new StringBuilder("List Client \n");
        for (User user : list) {
            if (checkAuthority(getUser(), user)) {
                client.append(user);
            }
        }
        return head + client;

    }

    public String showListStaff() {
        String head = "-----------List-Staff-------------\n";
        StringBuilder staff = new StringBuilder("List Staff \n");
        for (User user : list) {
            if (checkAuthority(getUser(), user)) {
                staff.append(user);
            }
        }
        return head + staff;
    }

    public String editPass(User user) {
        String pass = data.inputPass();
        if (checkAuthority(getUser(), user) && pass != null) {
            user.setPass(pass);
            return menu.done();
        }
        return menu.notAuthority();
    }

    public String editEmail(User user) {
        String email = data.inputEmail();
        if (checkAuthority(getUser(), user) && email != null) {
            user.setPass(email);
            return menu.done();
        }
        return menu.notAuthority();
    }

    public String editName(User user) {
        String name = data.inputName();
        if (checkAuthority(getUser(), user) && name != null) {
            user.setName(name);
            return menu.done();
        }
        return menu.notAuthority();
    }

    public String editPointBonus(User user) {
        int point = data.inputPointBonus();
        if (checkAuthority(getUser(), user)) {
            Client temp = (Client) user;
            temp.setPointBonus(point);
            temp.setRank(data.inputRank(point));
            return menu.done();
        }
        return menu.notAuthority();
    }

    public void editRank(User user) {// sửa sớm đi
        int point = data.inputPointBonus();
        if (checkAuthority(getUser(), user)) {
            Client temp = (Client) user;
            temp.setPointBonus(point);
            temp.setRank(data.inputRank(point));
            menu.done();
            return;
        }
        menu.notAuthority();
    }

    public String editRating(User user) {//
        double rating = data.inputRating();
        if (checkAuthority(getUser(), user)) {
            Staff temp = (Staff) user;
            temp.setRating(rating);
            return menu.done();
        }
        return menu.notAuthority();
    }

    public String editSalary(User user) {//
        double salary = data.inputSalary();
        if (checkAuthority(getUser(), user)) {
            Staff temp = (Staff) user;
            temp.setSalary(salary);
            return menu.done();
        }
        return menu.notAuthority();
    }

    public String editHourWork(User user) {//
        int hourWork = data.inputHourWork();
        if (checkAuthority(getUser(), user)) {
            Staff temp = (Staff) user;
            temp.setHourWork(hourWork);
            return menu.done();
        }
        return menu.notAuthority();
    }

}