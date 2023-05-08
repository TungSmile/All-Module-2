import java.util.Scanner;

public class th3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input size arr<20");
        int size = input.nextInt();
        while (size < 0 && size > 20) {
            System.out.println("input lai size");
            size = input.nextInt();
        }
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("input number: " + i);
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}