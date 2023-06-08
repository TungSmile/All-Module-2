// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("1");
        list.add(1, "3");
        list.add(2, "2");
        list.add(3, "6");
        list.add(4, "42");
        list.add(5, "5");
        list.printList();
        System.out.println("check clean");
        list.clean();
        list.printList();
    }
}
