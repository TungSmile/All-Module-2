package dayMonthYear;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("day");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println("month");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("year");
        int year = Integer.parseInt(scanner.nextLine());
        calcul date = new calcul(day, month, year);
        date.checkMonthInYear();
        date.checkDayInMonth();
        System.out.println("day: "+date.getDay()+" month: "+date.getMonth()+" year: "+date.getYear());
    }

}
