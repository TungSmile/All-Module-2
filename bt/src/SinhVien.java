public class SinhVien {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String adder;
    private double avangePoint;

    public SinhVien(int id, String name, int age, String sex, String adder, double avangePoint) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.adder = adder;
        this.avangePoint = avangePoint;
    }

    public SinhVien() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdder() {
        return adder;
    }

    public void setAdder(String adder) {
        this.adder = adder;
    }

    public double getAvangePoint() {
        return avangePoint;
    }

    public void setAvangePoint(double avangePoint) {
        this.avangePoint = avangePoint;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + age + "," + sex + "," + adder + "," + avangePoint + "\n";
    }
}
