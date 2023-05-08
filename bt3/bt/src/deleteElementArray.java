import java.util.Arrays;
import java.util.Scanner;

public class deleteElementArray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,3,4,5,0};
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                for (int j = i; j < arr.length-1 ; j++) {
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}