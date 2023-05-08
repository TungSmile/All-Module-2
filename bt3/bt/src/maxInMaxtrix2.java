import java.util.Arrays;
import java.util.Scanner;

public class maxInMaxtrix2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many row");
        int row = input.nextInt();
        System.out.println("how many colum");
        int col = input.nextInt();
        double[][] arr = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("input value to element Row " + i + "Col " + j + ": ");
                arr[i][j] = input.nextDouble();
            }
        }
        double max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Number Max: "+max);
    }
}
