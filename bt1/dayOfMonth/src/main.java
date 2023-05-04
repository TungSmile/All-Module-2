import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        System.out.println("input month");
        byte month=scaner.nextByte();
        if(month>0&&month<12){
            switch (month){
                case 2:
                    System.out.println("The month "+month+" has 28 or 29 days!");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("The month "+month+" has 31 days!");
                    break;
                default:
                    System.out.println("The month "+month+" has 30 days!");
            }
        }else {
            System.out.println("Are u sure this is Month!!!");
        }
    }
}
