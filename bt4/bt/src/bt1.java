import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap a");
        double a = input.nextDouble();
        System.out.println("nhap b");
        double b = input.nextDouble();
        System.out.println("nhap c");
        double c = input.nextDouble();
        QuadraticEquation pt=new QuadraticEquation(a,b,c);
        if (pt.getDiscriminant()>0){
            System.out.println("2 nghiem "+pt.getRoot1()+" "+pt.getRoot2());
        }else if (pt.getDiscriminant()==0){
            System.out.println("1 nghiem "+pt.getRoot1());
        }else {
            System.out.println("o nghiem");
        }

    }

}

class QuadraticEquation {
    private double a, b, c;


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {

        return (-this.b + Math.pow(getDiscriminant(), 0.5)) / 2 * this.a;

    }

    public double getRoot2() {

        return (-this.b - Math.pow(getDiscriminant(), 0.5)) / 2 * this.a;

    }
}