public class Custormer {
private int id;
private String name;
private String phone;
private Vaccine[] list;

    Custormer(int id, String name, String phone, Vaccine[] list) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.list = list;
    }

    Custormer() {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Vaccine[] getList() {
        return list;
    }

    public void setList(Vaccine[] list) {
        this.list = list;
    }
}
