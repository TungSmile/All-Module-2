import java.util.Scanner;

public class th1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        int width = scanner.nextInt();
        System.out.print("Enter the height:");
        int height = scanner.nextInt();
        Rectangel rectangle = new Rectangel(width, height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}

class Rectangel {
    int width, height;

    Rectangel() {
    }

    Rectangel(int a, int b) {
        this.width = a;
        this.height = b;
    }

    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return (this.width * this.height) * 2;
    }

    public String display() {
       return "dai " + this.width + " rong " + this.height;
    }
}