public class IDCard {
    private  int id;
    private String fullName;
    private String sex;
    private String date;
    private String adder;
    private int phone;

    public IDCard(int id, String fullName, String sex, String date, String adder, int phone) {
        this.id = id;
        this.fullName = fullName;
        this.sex = sex;
        this.date = date;
        this.adder = adder;
        this.phone = phone;
    }

    public IDCard() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAdder() {
        return adder;
    }

    public void setAdder(String adder) {
        this.adder = adder;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return this.id+this.fullName+this.sex+this.date+this.adder+this.phone;
    }
}
