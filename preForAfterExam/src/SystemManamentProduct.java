import java.util.*;
import java.util.Comparator;


public class SystemManamentProduct {
    Scanner sc = new Scanner(System.in);
    public LinkedList<Product> list = new LinkedList<>();

    SystemManamentProduct() {
    }

    public LinkedList<Product> getList() {
        return list;
    }

    public void setList(LinkedList<Product> list) {
        this.list = list;
    }

    public Product creNew() {
        do {
            try {
                System.out.println("Information New Product");
                System.out.print("Code Product : ");
                int code = Integer.parseInt(sc.nextLine());
                System.out.print("Name : ");
                String name = sc.nextLine();
                System.out.print("Price : ");
                int gia = Integer.parseInt(sc.nextLine());
                System.out.print("Describe : ");
                String des = sc.nextLine();
                System.out.print("Quality : ");
                int quality = Integer.parseInt(sc.nextLine());
                Product newpro = new Product(code, name, gia, des, quality);
                return newpro;
            } catch (Exception e1) {
                System.out.println("Nhập sai kiểu dữ liệu");
            }
        } while (true);

    }

    public int menu() {
        System.out.println("----Chương trình quản lý sản phẩm----");
        System.out.println("1.Xem danh sách ");
        System.out.println("2.Thêm mới");
        System.out.println("3.Cập nhật");
        System.out.println("4.Xóa");
        System.out.println("5.Sắp xếp");
        System.out.println("6.Tìm sản phẩm đắt nhất");
        System.out.println("7.Đọc từ file");
        System.out.println("8.Ghi từ file");
        System.out.println("9.Thoát");
        System.out.print("Chọn chức năng : ");
        int choise = Integer.parseInt(sc.nextLine());
        return choise;
    }

    public void show() {
        System.out.printf("%-15s%-25s%-18s%-23s%s", "Mã sp",
                "Tên sp ", "Giá sp", "Số lượng sp", "Mô tả sp \n");
        for (Product x : list) {
            System.out.printf("%-15s%-25s%-18s%-23s%s", x.getCodeProduct(),
                    x.getName(), x.getPrice(), x.getQuality(), x.getDescribe() + "\n");
        }
        System.out.println("Total sp : " + Product.count);
    }

    public void add() {
        boolean check = true;
        while (check) {
            Product a = creNew();
            if (checkDulicate(a)) {
                list.add(a);
                check = false;
            } else System.out.println("Trùng nhập lại");
        }
    }

    public void edit(Product p) {
        p = creNew();
        Product.count--;
    }

    public Product findByCode() {
        System.out.print("Gõ mã SP vào đây : ");
        int code = Integer.parseInt(sc.nextLine());
        for (Product x : list) {
            if (x.getCodeProduct() == code) {
                return x;
            }
        }
        return null;
    }


    public boolean checkDulicate(Product e) {
        for (Product x : list) {
            if (x.getCodeProduct() == e.getCodeProduct() || x.getName().equals(e.getName())) {
                return false;
            }
        }
        return true;
    }

    public void del() {
        while (true) {
            try {
                list.remove(findByCode());
                Product.count--;
                return;
            } catch (Exception e2) {
                System.out.println("ko có again");
            }
        }
    }

    public void sortByPrice() {
        list.sort(new ProductComparator());
    }

    public void findMaxPrice() {
        // cách 1 max lười
//        list.sort(new ProductComparator());
//        Product max=list.get(0);
//        System.out.printf("%-15s%-25s%-18s%-23s%s", "Mã sp",
//                "Tên sp ", "Giá sp", "Số lượng sp", "Mô tả sp \n");
//        System.out.printf("%-15s%-25s%-18s%-23s%s", max.getCodeProduct(),
//                max.getName(), max.getPrice(), max.getQuality(), max.getDescribe() + "\n");
    }
}