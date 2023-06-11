import java.util.Date;

public class Vaccine {
    private int id;
    private String name;
    private Date dateVaccine;
    private int price;
    private Date injectVaccine;

    Vaccine(int id, String name, Date dateVaccine, int price, Date injectVaccine) {
        this.id = id;
        this.name = name;
        this.dateVaccine = dateVaccine;
        this.price = price;
        this.injectVaccine = injectVaccine;
    }

    Vaccine() {
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

    public Date getDateVaccine() {
        return dateVaccine;
    }

    public void setDateVaccine(Date dateVaccine) {
        this.dateVaccine = dateVaccine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getInjectVaccine() {
        return injectVaccine;
    }

    public void setInjectVaccine(Date injectVaccine) {
        this.injectVaccine = injectVaccine;
    }
}
