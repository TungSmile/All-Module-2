package Function;

import Display.*;
import Module.*;

import java.util.ArrayList;

public class ControlStoreBook {
    private final CheckInputSystem data;
    private final Menu menu;
    public ArrayList<Books> listBook = new ArrayList<Books>();
    public ArrayList<Bill> listBill = new ArrayList<Bill>();

    private double balance = 0.0;

    public ControlStoreBook(ArrayList<Books> listBook, ArrayList<Bill> listBill) {
        this.data = new CheckInputSystem();
        this.menu = new Menu();
        this.listBook = listBook;
        this.listBill = listBill;

    }

    public ControlStoreBook() {// để tạm
        this.data = new CheckInputSystem();
        this.menu = new Menu();
    }

    public ArrayList<Books> getListBook() {
        return listBook;
    }

    public void setListBook(ArrayList<Books> listBook) {
        this.listBook = listBook;
    }

    public ArrayList<Bill> getListBill() {
        return listBill;
    }

    public void setListBill(ArrayList<Bill> listBill) {
        this.listBill = listBill;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Books findBookByID(int number) {
        for (Books books : getListBook()) {
            if (books.getId() == number) {
                System.out.println("Sách đã vào bill");
                return books;
            }
        }
        return null;
    }

    public static String showBook(ArrayList<Books> listBook) {
        String listShowBook = "\n---Danh Mục Sách---\n";
        for (Books books : listBook) {
            listShowBook += books.toString();
        }
        return listShowBook;
    }

    public static String showBill(ArrayList<Bill> listBill) {
        String listShowBill = "----------------Danh Sách Bill-----------\n";
        for (Bill bill : listBill) {
            listShowBill += bill.toString();
        }
        return listShowBill;
    }

    public Books createBook() {
        return new Books(data.inputName(), data.inputinputDescribe(), data.inputRealNumber());
    }

    public Bill createBill(String nameStaff, User client) {
        String nameClient = client.getName();
        ArrayList<Books> list = new ArrayList<>();
        System.out.println(showBook(getListBook()));
        while (true) {
            System.out.println("Nhập 0 để thoát");
            int numberIdBook = data.inputNumber();
            if (numberIdBook > 0) {
                list.add(findBookByID(numberIdBook));
            } else if (numberIdBook == 0) {
                Client temp = (Client) client;
                temp.setListBook(list);
                return new Bill(nameStaff, nameClient, list, listBill.size());
            } else System.out.println(menu.userNoBrain());
        }
    }

    public void add(Object o) {
        if (o instanceof Books) {
            Books temp = (Books) o;
            listBook.add(temp);
        }
        if (o instanceof Bill) {
            Bill temp = (Bill) o;
            setBalance(getBalance() + temp.getTotal());
            listBill.add(temp);
        }
    }


    public void delete(Object o) {
        if (o instanceof Books)
            listBook.remove(o);
        if (o instanceof Bill) {
            Bill temp = (Bill) o;
            setBalance(getBalance() - temp.getTotal());
            listBill.remove(o);
        }
    }

    public Bill buyOnline(Client client) {
        double balance = client.getPointBonus();
        String nameClient = client.getId();
        ArrayList<Books> list = new ArrayList<>();
        System.out.println(showBook(getListBook()));
        while (true) {
            System.out.println("Input Number 0 to Exit");
            int numberIdBook = data.inputNumber();
            if (numberIdBook > 0) {
                Books temp = findBookByID(numberIdBook);
                if (balance > temp.getCost()) {
                    balance -= temp.getCost();
                    list.add(temp);
                }
                System.out.println(" Not Enough Money");
            } else if (numberIdBook == 0) {
                client.setListBook(list);
                return new Bill("OnLine", nameClient, list, listBill.size());
            } else System.out.println(menu.userNoBrain());
        }

    }
}
