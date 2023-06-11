

public class AdministrativeEmployee extends Employee {
    private int dayOff;
    static int count;

    AdministrativeEmployee(String name, int age, int salary, int dayWork, int dayOff) {
        super(name, age, salary,  dayWork);
        this.dayOff = dayOff;
        this.setId(++count);
    }

    AdministrativeEmployee(int id,String name, int age, int salary, int dayWork, int dayOff) {
        super(name, age, salary,  dayWork);
        this.dayOff = dayOff;
        this.setId(id);
        count++;
    }

    AdministrativeEmployee() {
    }

    public int getDayOff() {
        return dayOff;
    }

    public void setDayOff(int dayOff) {
        this.dayOff = dayOff;
    }



    public void calculateMonthlySalary() {
        this.setSalary(500*(this.getDayWork()-this.getDayOff()));
    }


    public void getInfo() {
        System.out.printf("%-15s%-18s%-18s%-23s%s", this.getId(),
                this.getName(), this.getDayWork(), this.getDayOff(), "\n");

    }

    public String toString() {
        return this.getId()+","+this.getName()+","+this.getAge()+","
                +this.getSalary()+","+this.getDayWork()+","+this.getDayOff();
    }

}
