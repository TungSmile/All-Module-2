import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateRex {
    final private Scanner scanner = new Scanner(System.in);
    private static final String nameRegex = "^[a-zA-Z]{3,15}$";

    public int choisenumber() {
        while (true) {
            try {
                System.out.print("Chọn Chức Năng :");
                int number= Integer.parseInt(scanner.nextLine());
                if (number>0)return 0;
            } catch (Exception e) {

            }
        }
    }

    public boolean validateName(String id) {
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    public String inputName() {
        while (true) {
            try {
                System.out.print(" Nhập Tên : ");
                String name = scanner.nextLine();
                if (validateName(name)) {
                    return name;
                } else System.out.println("Name không được có số");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int inputAge() {
        while (true) {
            try {
                System.out.print(" Nhập Tuổi : ");

                int age = Integer.parseInt(scanner.nextLine());
                if (age >= 15) {
                    return age;
                } else System.out.println("tuổi >= 15");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String inputSex() {
        while (true) {
            try {
                System.out.println(" Chọn Giới Tính \n1.Nam\n2.Nữ");

                System.out.print("Chọn : ");
                int sex = Integer.parseInt(scanner.nextLine());
                if (sex == 1) {
                    return "Nam";
                } else if (sex == 2) {
                    return " Nữ ";
                } else System.out.println("giới tính chỉ được nam/nữ");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public double inputPoint() {
        while (true) {
            try {
                System.out.print(" Nhập Điểm : ");
                double point = Double.parseDouble(scanner.nextLine());
                if (point >= 0 && point <= 10) {
                    return point;
                } else System.out.println("Điểm trung bình >= 0 <=10");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
