public class Main {
    public static void main(String[] args) {
        SystemManamentProduct manament = new SystemManamentProduct();
        Product test = new Product(1, "sp1", 3, "Exmaple", 1);
        Product test1 = new Product(2, "sp2", 1, "Exmaple", 1);
        Product test2 = new Product(3, "sp3", 2, "Exmaple", 1);
        manament.list.add(test);
        manament.list.add(test1);
        manament.list.add(test2);
        while (true) {
            switch (manament.menu()) {
                case 1:
                    manament.show();
                    break;
                case 2:
                    manament.add();
                    break;
                case 3:
                    manament.edit(manament.findByCode());
                    break;
                case 4:
                    manament.del();
                    break;
                case 5:
                    manament.sortByPrice();
                    break;
                case 6:
                    manament.findMaxPrice();
                    break;
                case 7:
                case 8:
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Chọn lại đi bạn trẻ");
            }
        }
    }
}
