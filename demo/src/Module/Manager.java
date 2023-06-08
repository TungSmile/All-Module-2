package Module;

public class Manager extends User {
    private static final long serialVersionUID = 1L;
    double balance;

    public Manager(String id, String pass, String name, String phone, String email) {
        super(id, pass, name, phone, email);
    }

    public Manager(double balance) {
        this.balance = balance;
    }
}
