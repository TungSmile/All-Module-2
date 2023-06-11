public class Employee  {

   private String name;
   private int age;
   private int salary;
    private int id;
   private int dayWork=0;

    Employee(String name, int age, int salary, int dayWork) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dayWork = dayWork;
    }

    Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDayWork() {
        return dayWork;
    }

    public void setDayWork(int dayWork ) {
        this.dayWork = dayWork;
    }
    public void attendance(){
        this.dayWork++;
    }
    public void calculateMonthlySalary(){}

public void getInfo(){}

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", id=" + id +
                ", dayWork=" + dayWork +
                '}';
    }
}
