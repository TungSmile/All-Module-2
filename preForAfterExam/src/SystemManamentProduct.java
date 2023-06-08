import java.util.LinkedList;
import java.util.Scanner;

public class SystemManamentProduct {
    Scanner sc = new Scanner(System.in);
    private LinkedList<Product> list = new LinkedList<>();

    SystemManamentProduct() {
    }

    public LinkedList<Product> getList() {
        return list;
    }

    public void setList(LinkedList<Product> list) {
        this.list = list;
    }

    public void addnew() {
        System.out.println("Information New Product");
        System.out.print("Code Product : ");
        String code = sc.nextLine();
        System.out.print("Name : ");
        String name = sc.nextLine();
        System.out.print("Price : ");
        int gia = Integer.parseInt(sc.nextLine());
        System.out.print("Describe : ");
        String des = sc.nextLine();
        Product newpro = new Product(code, name, gia, des);
    }

    public void menu(){
        System.out.println("----Chương trình quản lý sản phẩm----");
    }

}
