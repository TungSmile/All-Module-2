import java.util.Scanner;

public class ManagentStuden {
    Studen[] list = new Studen[5];
    Scanner input = new Scanner(System.in);

    ManagentStuden() {
        list[0] = new Studen(1, "a", 2);
        list[1] = new Studen(2, "b", 2);
    }

    public void show() {
        for (Studen x : list) {
            System.out.println(x.getId() + " Name : " + x.getName() + " Age : " + x.getAge());
        }
    }

    void add() {
        Studen[] list;
    }
    void del() {
        System.out.println("What row u want del ?");
        int row=input.nextInt();

    }
}
