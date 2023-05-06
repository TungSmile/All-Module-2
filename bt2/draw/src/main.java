import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int choise;
        boolean a=true;
        while (a) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
         choise=input.nextInt();
            switch (choise) {
                case 1: {
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                break;
                case 2: {
                    System.out.println("1.top-left");
                    System.out.println("2.top-right");
                    System.out.println("3.botton-left");
                    System.out.println("4.botton-right");
                    byte pick = input.nextByte();
                    switch (pick) {
                        case 1: {
                            for (int i = 0; i < 6; i++) {
                                for (int j = 0; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();

                            }
                            break;
                        }

                        case 2: {
                            for (int i = 0; i < 6; i++) {
                                for (int j = i; j <6 ; j++) {
                                    System.out.print(" ");
                                }
                                for (int j = 0; j < i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        }

                        case 3:{
                            for (int i = 0; i < 6; i++) {
                                for (int j = i; j <6 ; j++) {
                                    System.out.print("*");
                                }
                                for (int j = 0; j < i; j++) {
                                    System.out.print(" ");
                                }
                                System.out.println();
                            }
                            break;
                        }
                        case 4:{
                            for (int i = 0; i < 6; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print(" ");
                                }
                                for (int j = i; j < 6; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        }
                        default: {
                            System.out.println("ko pick thi thoi");
                        }

                    }


                }
                case 3:{
                    for (int i = 0; i < 4; i++) {
                        for (int j = i; j < 3; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= i*2; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 4:{
                    a=false;
                }
            }
        }
    }
}
