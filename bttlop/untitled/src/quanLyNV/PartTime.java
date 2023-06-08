package quanLyNV;

import java.util.Date;

public class PartTime extends Staff {
    private double hourWork;
    private static int count;

    PartTime() {
        count++;
    }

    PartTime(String name, int id, String phone, String birthday, double hourWork) {
        this.name = name;
        this.id=id;
        this.phone=phone;
        this.birthday=birthday;
        this.hourWork=hourWork;
        this.salary = this.hourWork * 30000;
        count++;
    }

    public double getHourWork() {
        return hourWork;
    }

    public static int getCount() {
        return count;
    }

}
