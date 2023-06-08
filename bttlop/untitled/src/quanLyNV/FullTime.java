package quanLyNV;

import java.util.Date;

public class FullTime extends Staff {
   private double rateSalary ;
   private static  int count;
    FullTime(){
        count++;
    }
    FullTime(String name, int id, String phone, String birthday, double rateSalary) {
        this.name = name;
        this.id=id;
        this.phone=phone;
        this.birthday=birthday;
        this.rateSalary=rateSalary;
        this.salary = this.rateSalary * 3000000;
        count++;
    }

    public double getRateSalary() {
        return rateSalary;
    }

    public static int getCount() {
        return count;
    }

}
