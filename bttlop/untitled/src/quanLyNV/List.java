package quanLyNV;

import java.util.Scanner;

public class List {
    static PartTime[] listpt = new PartTime[PartTime.getCount()];
    static FullTime[] listft = new FullTime[FullTime.getCount()];

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1. Show list staff");
        System.out.println("2. Add new staff");
        System.out.println("3. Calculator salary of staff");
        System.out.println("4. Delete staff when leave");
        System.out.println("6. Find staff for name");
        System.out.println("7. Sort by age");
        System.out.println("8. Exit");
    }

    public static void show() {
        System.out.println("------------------------------------------");
        for (FullTime x : listft) {
            System.out.print("Id : " + x.id);
            System.out.print(" Name : " + x.name);
            System.out.println(" Phone : " + x.phone);
            System.out.print(" Birthday:" + x.birthday);
            System.out.println(" HourWork:" + x.getRateSalary());
            System.out.println(" Salary:" + x.salary);
        }
        System.out.println("------------------------------------------");
        for (PartTime x : listpt) {
            System.out.print("Id : " + x.id);
            System.out.print(" Name : " + x.name);
            System.out.println(" Phone : " + x.phone);
            System.out.print(" Birthday:" + x.birthday);
            System.out.println(" HourWork:" + x.getHourWork());
            System.out.println(" Salary:" + x.salary);
        }
    }

    public static void add() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Name new staff");
        String name = input.nextLine();
        System.out.println("Input Phone new staff");
        String phone = input.nextLine();
        System.out.println("Input Birthday new staff");
        String bir = input.nextLine();
        System.out.println("Choise staff :");
        System.out.println("1. staff Fulltime");
        System.out.println("2. staff Parttime");
        int choise = input.nextInt();
        if (choise == 1) {
            System.out.println("Input rateSalary");
            double rate = input.nextDouble();
            FullTime newstaff = new FullTime(name, Staff.getTotalEmploy() + 1, phone, bir, rate);
            FullTime[] newlist = new FullTime[FullTime.getCount() ];
            System.arraycopy(listft, 0, newlist, 0, listft.length);
            newlist[newlist.length-1] = newstaff;
            listft = newlist;
        } else if (choise == 2) {
            System.out.println("Input HourWork");
            double hour = input.nextDouble();
            PartTime newstaff = new PartTime(name, Staff.getTotalEmploy() + 1, phone, bir, hour);
            PartTime[] newlist = new PartTime[PartTime.getCount() ];
            System.arraycopy(listpt, 0, newlist, 0, listpt.length);
            newlist[newlist.length-1] = newstaff;
            listpt = newlist;
        } else
            System.out.println("Erro , choise agian!!!");
    }

    public static void del() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Id staff u want del");
        int a = input.nextInt();



    }

    public static void edit() {

    }

    public static void find() {

    }

    public static void sort() {

    }

    public static void cal() {
        System.out.println("thấy thừa vãi chưởng");
    }
}
