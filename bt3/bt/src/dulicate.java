import java.util.Scanner;

public class dulicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input arr : ");
        String arr = input.nextLine();
        System.out.print("input symbol : ");
        char sym = input.next().charAt(0);
        int count=0;
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i)==sym){
                count++;
            }
        }
        System.out.println("Symbol: "+sym+" has "+count+" time in string");
    }
}
