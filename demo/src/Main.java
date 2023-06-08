import Function.ControlStoreBook;
import IO.TransactionProcessing;
import Module.Books;

import static IO.TransactionProcessing.linkBook;

public class Main {
    public static void main(String[] args) {
        Manage b = new Manage();
//        a.list.add(new Staff("qwerty", "qwerty", "c", "d", "e.@gmail.com", 1.2, 1.1, 1));
//        a.list.add(new Staff("b", "b", "c", "d", "e.@gmail.com", 1.2, 1.1, 1));
//        a.list.add(new Client("qwertb", "b", "c", "d", "e.@gmail.com", "f", 7));
//       a.list.add(new Client("qwerta", "b", "c", "d", "e.@gmail.com", "f", 7));
//       a.list.add(new Manager("admin1", "123456", "boss", "113", "nothing.@gmail.com"));
//      qwertc x3  0123456789 nothing@gmail.com
//        b.start();
//        ControlStoreBook controlStoreBook=new ControlStoreBook();
//        controlStoreBook.listBook.add(new Books("Tắt Đèn "," kể về c.Dậu dùng uti Noctune ",5.500));
//        controlStoreBook.listBook.add(new Books("Chí Phéo "," Cháo hành và khẩu nghiệp ",5.600));
//        TransactionProcessing a=new TransactionProcessing();
//       a.writeToFileBook(linkBook,controlStoreBook.listBook);
        ControlStoreBook controlStoreBook = new ControlStoreBook(TransactionProcessing.readToFileBook(linkBook));
//        System.out.println( controlStoreBook.showBook());
        controlStoreBook.createBill("qwerty", "qwertc");

    }
}

