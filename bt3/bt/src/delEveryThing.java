import java.net.BindException;
import java.util.Arrays;
import java.util.Scanner;

public class delEveryThing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input arr");
        String arr = input.nextLine();
        int number = input.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == number) {
                count++;
            }
        }
        int[] arr2 = new int[arr.length() - count];
        int index = 0;
        for (int i = 0; i < arr.length(); i++) {
            int temp=Character.getNumericValue(arr.charAt(i));
            if (temp != number) {
                arr2[index] = temp;
                index++;
            }

        }

        System.out.println(Arrays.toString(arr2));
    }
}
