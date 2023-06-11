import java.util.Scanner;

public class Main {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
    public static void main(String[] args) {
//        emailExample = new EmailExample();
//        for (String email : validEmail) {
//            boolean isvalid = emailExample.validate(email);
//            System.out.println("Email is " + email + " is valid: " + isvalid);
//        }
//        for (String email : invalidEmail) {
//            boolean isvalid = emailExample.validate(email);
//            System.out.println("Email is " + email + " is valid: " + isvalid);
//        }
        Scanner scanner=new Scanner(System.in); // test với class account
        String a= scanner.nextLine();
//        AccountExample accountExample = new AccountExample();
//        System.out.println( accountExample.validate(a));

        // bt james 1
//        NameClass testregex=new NameClass();
//        System.out.println( testregex.validate(a));

        ValidatePhone phone= new ValidatePhone();
        System.out.println(phone.validate(a));

    }
}
