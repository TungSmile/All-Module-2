import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

//    @Override
//    public int compareTo(Product o) {
//        return 0;
//    }
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() == o2.getPrice()) {
            return 0;
        } else return -1;
    }
}
