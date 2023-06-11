public class TechnicalEmployee extends Employee  {
    private int project;
    static int count;

    TechnicalEmployee(String name, int age, int salary, int dayWork, int project) {
        super(name, age, salary, dayWork);
        this.project = project;
        this.setId(++count);
    }

    TechnicalEmployee(int id,String name, int age, int salary, int dayWork, int project) {
        super(name, age, salary, dayWork);
        this.project = project;
        this.setId(id);
        count++;
    }

    TechnicalEmployee() {
    }

    public int getProject() {
        return project;
    }

    public void setProject(int project) {
        this.project = project;
    }


    public void calculateMonthlySalary() {
        this.setSalary(500 * this.getDayWork() + 200*this.getProject());
    }

    @Override
    public void getInfo() {
        System.out.printf("%-15s%-18s%-18s%-23s%s", this.getId(),
                this.getName(), this.getDayWork(), this.getProject(),"\n");
    }

    @Override
    public String toString() {
        return this.getId()+","+this.getName()+","+this.getAge()+","
                +this.getSalary()+","+this.getDayWork()+","+this.getProject();
    }
}