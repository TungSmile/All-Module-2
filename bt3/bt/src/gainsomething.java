import java.util.Arrays;
import java.util.Scanner;

public class gainsomething {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2,4,5,7,3,4,5,0};
        int[]arr1=new int[arr.length+1];
        System.out.println("value");
        int value = input.nextInt();
        int index;
        do {
            System.out.println("index");
            index = input.nextInt();
        } while (index <= -1 || index >= arr.length);
        System.arraycopy(arr,0,arr1,0,arr.length);
        for (int i = arr.length; i > index; i--) {
          arr1[i]=arr[i-1];
        }
        arr1[index]=value;
        System.out.println(Arrays.toString(arr1));
        }
    }

