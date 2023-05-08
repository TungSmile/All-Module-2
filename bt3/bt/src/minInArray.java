import java.util.Arrays;
import java.util.Scanner;

public class minInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lenght=?");
        int len = input.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("input value at index"+(i-1));
            arr[i]=input.nextInt();
        }
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min: "+min);
    }
}
