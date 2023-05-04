import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        float width;
        byte height;
        Scanner scaner= new Scanner(System.in);
        System.out.println("Nhập chiều cao");
        width=scaner.nextFloat();
        System.out.println("Nhập chiều dài");
        height=scaner.nextByte();
        float area=width*height;
        System.out.println(area);
    }
}
