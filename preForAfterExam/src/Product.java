import java.util.Comparator;

public class Product  {
    private int codeProduct;
    private String name;
    private int price;
    static int count = 0;
    private String describe;
    private int quality = 0;

    Product() {
        count++;
    }

    public Product(int codeProduct, String name, int price, String describe, int quality) {
        this.codeProduct = codeProduct;
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.quality = quality;
        count++;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public String getDes() {
        return describe;
    }

    public void setDes(String der) {
        this.describe = der;
    }

    public String getDescribe() {
        return describe;
    }

    public int getQuality() {
        return quality;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }



}
