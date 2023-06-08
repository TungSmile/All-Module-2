package quanLyHS;

public class Studen {
    int id;
    String name;
    int age;
    int slot=1;

    Studen() {
    }

    Studen(int a, String b, int c) {
        id = a;
        name = b;
        age = c;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        }
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSlot() {
        return slot;
    }
}
