public class Product {
    private String codeProduct;
    private String name;
    private int price;
    static int count = 0;
    private String describe;

    public Product() {
        count++;
    }

    public Product(String codeProduct, String name, int price, String describe) {
        this.codeProduct = codeProduct;
        this.name = name;
        this.price = price;
        this.describe = describe;
        count++;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
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
}
