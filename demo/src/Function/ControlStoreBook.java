package Function;

import Display.*;
import Module.*;

import java.util.ArrayList;

public class ControlStoreBook {
    private final CheckInputSystem data;
    private final Menu menu;
    public ArrayList<Books> listBook = new ArrayList<Books>();
    public ArrayList<Bill> listBill = new ArrayList<Bill>();

    private double balance=0.0;

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

    public ControlStoreBook(ArrayList<Books> books) {
        this.listBook = books;
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

    public Books findBookByID() {
        int idBook = data.inputNumber();
        for (Books books : getListBook()) {
            if (books.getId() == idBook) {
                return books;
            }
        }
        return null;
    }

    public static String showBook(ArrayList<Books> listBook) {
        String listShowBook = "-------------Danh Mục Sách------------\n";
        for (Books books : listBook) {
            listShowBook += books.toString();
        }
        return listShowBook;
    }

    public Books createBook(int number) {
        return new Books(data.inputName(), data.inputinputDescribe(), data.inputRealNumber());
        // return null;
    }

    public Bill createBill(String nameStaff, String nameClient) {
        ArrayList<Books> list = new ArrayList<>();
        System.out.println(showBook(getListBook()));
        while (true) {
            System.out.println("Nhập 0 để thoát");
            int numberIdBook = data.inputNumber();
            if (numberIdBook > 0) {
                for (Books books : getListBook()) {
                    if (numberIdBook == books.getId()) {
                        list.add(books);
                    } else {System.out.println("Méo có ???");}
                }
            } else if (numberIdBook == 0) {
                Bill temp=new Bill(nameStaff, nameClient, list);
                double balance=getBalance();
                 setBalance(balance + temp.getTotal());
                return temp;
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
            listBill.add(temp);
        }
    }


    public void delete(Object o) {
        if (o instanceof Books)
            listBook.remove(o);
        if (o instanceof Bill)
            listBill.remove(o);
    }


}
