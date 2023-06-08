package quanLyNV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choise;
        do {
            List.menu();
            choise = input.nextInt();
            switch (choise) {
                case 1:
                    List.show();
                    break;
                case 2:
                    List.add();
                    break;
                case 4:
                    List.del();
                    break;
                case 5:
                    List.edit();
                    break;
                case 6:
                    List.find();
                    break;
                case 7:
                    List.sort();
                    break;
                case 3:
                    List.cal();
                    break;
                case 8:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Erro , choise agian!!!");
            }
        } while (choise != 8);
    }



}
