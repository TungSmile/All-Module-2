import java.util.Scanner;

public class sumValueCol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Create Matrix");
        System.out.println("how many row");
        int row = input.nextInt();
        System.out.println("how many colum");
        int col = input.nextInt();
        double[][] arr = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("input value to element Row " + i + " Col " + j + ": ");
                arr[i][j] = input.nextDouble();
            }
        }
        System.out.println("Sum col");
        int sumcol = input.nextInt();
        if (sumcol < col) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum += arr[sumcol][i];
            }
            System.out.println("Sum: " + sum);
        }else {
            System.out.println("làm méo có cột ấy");
        }
    }
}
