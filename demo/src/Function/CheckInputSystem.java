package Function;
import Display.*;
import java.util.Scanner;

public class CheckInputSystem {
    private final Regex regex = new Regex();
    Scanner scanner = new Scanner(System.in);
    private final Menu menu=new Menu();

    public String inputId() {
            while (true) {
                System.out.print(menu.inputID());
                String id = scanner.nextLine();
                if (regex.validateId(id))
                    return id;
                System.out.println("6-12 ký tự có chữ và số ");
            }
    }

    public String inputPass() {
        while (true){
            System.out.print(menu.inputPass());
            String pass = scanner.nextLine();
            if (regex.validatePass(pass))
                return pass;
            System.out.println("6-12 ký tự có chữ và số ");}
    }

    public String inputName() {
        while (true){
            System.out.print(menu.inputFullName());
            String pass = scanner.nextLine();
            if (regex.validatePass(pass))
                return pass;
            System.out.println("4-15 ký tự chỉ có chữ");}
        }


    public String inputPhone() {
        while (true){
            System.out.print(menu.inputPhone());
            String phone = scanner.nextLine();
            if (regex.validatePhone(phone))
                return phone;
            System.out.println("Đầu 0 hoặc 84 kèm 9 chữ số");
        }
    }

    public String inputEmail() {
        while (true){
            System.out.print(menu.inputEmail());
            String mail = scanner.nextLine();
            if (regex.validateEmail(mail))
                return mail;
            System.out.println("cú pháp xxx@xxx.xxx");

        }
    }

    public int inputPointBonus() {
        try {
            System.out.print(menu.inputPointBonus());
            return Integer.parseInt( scanner.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(menu.magicHappen());
            return 0;
        }
    }
    public int inputHourWork() {
        try {
            System.out.print(menu.inputHourWork());
            return Integer.parseInt( scanner.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(menu.magicHappen());
            return 0;
        }
    }
    public double inputRating() {
        try {
            System.out.print(menu.inputRating());
            return Double.parseDouble( scanner.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(menu.magicHappen());
            return 0;
        }
    }
    public double inputSalary() {
        try {
            System.out.print(menu.inputSalary());
            return Double.parseDouble( scanner.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(menu.magicHappen());
            return 0;
        }
    }

    public int inputNumber() {
        try {
            System.out.println(menu.inputNumber());
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String inputRank(int o) {
        if (o >= 10000000) {
            return "MemberSVip";
        } else if (o >= 5000000) {
            return "MemberVip";
        } else if (o >= 1000000) {
            return "MemberLoyal";
        } else if (o >= 500000) {
            return "Member";
        } else if (o >= 0) {
            return "NewMember";
        } else return "Are U hacker ? 0.0";
    }
    public double inputRealNumber() {
        try {
            System.out.println(menu.inputRealNumber());
            return Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }
    public String inputinputDescribe(){
        try {
            System.out.println(menu.inputDescribe());
            return scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
