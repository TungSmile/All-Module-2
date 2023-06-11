package th1;

public class th1 {
    public static void main(String[] args) {
        final Table obj = new Table();// tao object duy nhat

        Thread t1 = new Thread() {
            public void run() {
                obj.printTable(5);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }

}


class Table {
    int a = 2;
    int b = 3;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return "đoán xem";
    }

    public void setB(int b) {
        this.b = b;
    }

    void printTable(int n) {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i + this.getB());
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}