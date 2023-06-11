public class SalesEmployee extends Employee {
    private int sale;
    static  int count;

    public SalesEmployee(String name, int age, int salary, int dayWork, int sale) {
        super(name, age, salary, dayWork);
        this.sale = sale;
        this.setId(++count);
    }

    public SalesEmployee(int id,String name, int age, int salary, int dayWork, int sale) {
        super(name, age, salary, dayWork);
        this.sale = sale;
        this.setId(id);
        count++;
    }

    public SalesEmployee() {
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public void calculateMonthlySalary() {
        this.setSalary(300*this.getDayWork()+50*this.getSale());
    }

    @Override
    public void getInfo() {
        System.out.printf("%-15s%-18s%-18s%-23s%s", this.getId(),
                this.getName(), this.getDayWork(), this.getSale(),"\n");
    }
    public String toString() {
        return this.getId()+","+this.getName()+","+this.getAge()+","
                +this.getSalary()+","+this.getDayWork()+","+this.getSale();
    }
}
