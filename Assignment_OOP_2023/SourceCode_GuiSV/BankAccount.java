public class BankAccount implements Payment, Transfer{
    private double balance;
    private int id;
    private double rate;

    public BankAccount(int id, double rate) {
        this.id = id;
        this.rate = rate;
        this.balance=50;
    }

    public void topUp(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
    @Override
    public boolean pay(double amount) {
        if (this.checkBalance()-50 > amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean transfer(double amount, Transfer to) {
        double fee = amount * transferFee;
        double transfer = amount + fee;
        EWallet temp;
        BankAccount temp1;
        if (this.checkBalance()-50 >= transfer && to instanceof EWallet) {
            this.balance -= transfer;
            temp = (EWallet) to;
            temp.topUp(amount);
        } else if (this.checkBalance()-50 >= transfer && to instanceof BankAccount) {
            this.balance -= transfer;
            temp1 = (BankAccount) to;
            temp1.topUp(amount);
        }
        return false;
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }
    // code here
}
