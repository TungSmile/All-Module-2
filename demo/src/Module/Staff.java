package Module;

public class Staff extends User {
    private static final long serialVersionUID = 1L;
    private double rating=0.0;
    private double salary=0.0;
    private int hourWork=0;

    public Staff(String id, String pass, String name, String phone, String email, double rate, double salary, int hourWork) {
        super(id, pass, name, phone, email);
        this.rating = rate;
        this.salary = salary;
        this.hourWork = hourWork;

    }

    public Staff(String id, String pass, String name, String phone, String email) {
        super(id, pass, name, phone, email);
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
        return super.toString()+"    Rate : "+getRating() +"    HourWork : "+getHourWork()+"    Salary : "+getSalary()+"\n"
                +"----------------------------------------------------------------------------------------------------\n";
    }
}
