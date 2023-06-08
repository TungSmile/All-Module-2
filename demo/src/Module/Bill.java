package Module;
import Function.ControlStoreBook;

import java.io.Serializable;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Bill implements Serializable {
    private static final long serialVersionUID = 1L;
    private LocalDateTime currentTime;
    int id;
    private String idStaff;
    private String idClient;
    private ArrayList<Books> listBook ;
    private double total=0.0;
    static int count;

    public Bill( String idStaff, String idClient, ArrayList<Books> listBook) {
        this.currentTime = LocalDateTime.now();
        this.idStaff = idStaff;
        this.idClient = idClient;
        this.listBook = listBook;
        for (Books book:listBook){
        this.total+= book.getCost();}
        count++;
        this.id=count;
    }



    public String getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(String idStaff) {
        this.idStaff = idStaff;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public ArrayList<Books> getListBook() {
        return listBook;
    }

    public void setListBook(ArrayList<Books> listBook) {
        this.listBook = listBook;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDateTime getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(LocalDateTime currentTime) {
        this.currentTime = currentTime;
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
        Bill.count = count;
    }

    @Override
    public String toString() {
        return "ID : "+getId()+"/ Thời gian ra hóa đơn : "+getCurrentTime()+"/Người bán : "
                +getIdStaff()+"/ Người mua "+getIdClient()+"/ Sách mua :"+ ControlStoreBook.showBook(getListBook())+"\n";
    }
}
