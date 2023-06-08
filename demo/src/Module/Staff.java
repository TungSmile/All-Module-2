package Module;

public class Staff extends User {
    private static final long serialVersionUID = 1L;
    private static int count;
    private double rating;
    private double salary;
    private int hourWork;

    public Staff(String id, String pass, String name, String phone, String email, double rate, double salary, int hourWork) {
        super(id, pass, name, phone, email);
        this.rating = rate;
        this.salary = salary;
        this.hourWork = hourWork;
        count++;
    }

    public Staff(String id, String pass, String name, String phone, String email) {
        super(id, pass, name, phone, email);
        count++;
    }

    public Staff() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Staff.count = count;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHourWork() {
        return hourWork;
    }

    public void setHourWork(int hourWork) {
        this.hourWork = hourWork;
    }

    @Override
    public String toString() {
        return super.toString()+"    Rate : "+this.rating +"    HourWork : "+this.hourWork+"    Salary : "+this.salary+"\n"
                +"----------------------------------------------------------------------------------------------------\n";
    }
}
