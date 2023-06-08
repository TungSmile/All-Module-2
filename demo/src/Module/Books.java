package Module;

import java.io.Serializable;

public class Books implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private  int quality=5;
    private String describe;
    private double cost;
    private static int count;


    public Books(String name, String describe, double cost) {
        this.name = name;
        this.describe = describe;
        this.cost = cost;
        count++;
        this.id = count;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Books.count = count;
    }

    @Override
    public String toString() {
        return "ID : "+this.getId()+" /Tên : "+this.getName()+"/ Miêu tả :"+this.getDescribe()+"/ Giá : "
                +this.getCost()+"/ Số lượng :"+this.getQuality()+"\n";
    }
}
