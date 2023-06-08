package IO;

import Module.*;

import java.io.*;
import java.util.*;

public class TransactionProcessing {
    public static String linkUser = "D:\\Module 2\\demo\\Data\\User.txt";
    public static String linkBook = "D:\\Module 2\\demo\\Data\\Book.txt";
    public static String linkBill = "D:\\Module 2\\demo\\Data\\Bill.txt";

    public static void writeToFileUser(String link, ArrayList<User> list) {
        try (
                FileOutputStream fos = new FileOutputStream(link);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<User> readToFileUser(String link) {
        ArrayList<User> list = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(link);
             ObjectInputStream ois = new ObjectInputStream(fis);) {
            list = (ArrayList<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writeToFileBook(String link, ArrayList<Books> list) {
        try (
                FileOutputStream fos = new FileOutputStream(link);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Books> readToFileBook(String link) {
        ArrayList<Books> list = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(link);
             ObjectInputStream ois = new ObjectInputStream(fis);) {
            list = (ArrayList<Books>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writeToFileBill(String link, ArrayList<Bill> list) {
        try (
                FileOutputStream fos = new FileOutputStream(link);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Bill> readToFileBill(String link) {
        ArrayList<Bill> list = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(link);
             ObjectInputStream ois = new ObjectInputStream(fis);) {
            list = (ArrayList<Bill>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}