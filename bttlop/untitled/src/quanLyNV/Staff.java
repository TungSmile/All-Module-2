package quanLyNV;

import java.util.Date;

public class Staff {
    String name;
    int id;
    String phone;
    String birthday;
   public double salary;

   private static int totalEmploy;

    Staff(){
        totalEmploy++;
    }

    public static int getTotalEmploy() {
        return totalEmploy;
    }


}
