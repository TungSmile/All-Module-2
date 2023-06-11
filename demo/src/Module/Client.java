package Module;

import java.util.ArrayList;

public class Client extends User {
    private static final long serialVersionUID = 1L;
    private ArrayList<Books> listBook = new ArrayList<>();
    private String rank;
    private int pointBonus = 0;


    public Client(String id, String pass, String name, String phone, String email, String rank, int pointBonus) {
        super(id, pass, name, phone, email);
        this.rank = rank;
        this.pointBonus = pointBonus;
    }

    public Client(String id, String pass, String name, String phone, String email) {
        super(id, pass, name, phone, email);
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getPointBonus() {
        return pointBonus;
    }

    public void setPointBonus(int pointBonus) {
        this.pointBonus = pointBonus;
    }

    public ArrayList<Books> getListBook() {
        return listBook;
    }

    public void setListBook(ArrayList<Books> listBook) {
        this.listBook = listBook;
    }

    @Override
    public String toString() {
        return super.toString() + "    Rank : " + getRank() + "    Point Bonus : " + getPointBonus() + "\n"
                + "-----------------------------------------------------------------------------------------------------\n";
    }


}
