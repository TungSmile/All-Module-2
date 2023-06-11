import java.time.Year;

public class ConvenientCard implements Payment {
    // code here
    private IDCard idCard;
    private double balance;
    private String type;

    public ConvenientCard(IDCard idCard) throws CannotCreateCard {
        this.idCard = idCard;
        this.balance = 100;
        Year currentYear = Year.now();
        int yearValue = currentYear.getValue();
        int yearOld = yearValue - Integer.parseInt(idCard.getDate().substring(6));
        if (yearOld > 18) {
            this.type = "Adult";
        } else if (yearOld >= 12) {
            this.type = "Student";
        } else throw new CannotCreateCard("Not enough age");
    }

    public void topUp(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public String getType() {
        return this.type;
    }

    @Override
    public boolean pay(double amount) {
        double fee = 0;
        if (this.type.equals("Adult")) {
            fee = amount / 100;
        }
        if (this.balance > (amount + fee)) {
            this.balance-=(amount + fee);
            return true;
        } else return false;
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }
}
