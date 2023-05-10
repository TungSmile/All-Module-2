
import java.util.Arrays;


public class concatJava {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 3, 4, 5, 0};
        int[] arr1 = {12, 45, 2,};
        int[] arr2 = new int[arr.length + arr1.length];
        System.arraycopy(arr,0,arr2,0,arr.length);
        System.arraycopy(arr1,0,arr2,arr.length,arr1.length);
        System.out.println(Arrays.toString(arr2));
    }
}
