public class EWallet implements Payment, Transfer {
    private int phone;
    private double balance;

    public EWallet(int phone) {
        this.phone = phone;
        this.balance = 0;
    }

    public void topUp(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    @Override
    public boolean pay(double amount) {
        if (this.balance > amount) {
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
        if (this.balance >= transfer && to instanceof EWallet) {
            this.balance -= transfer;
            temp = (EWallet) to;
            temp.topUp(amount);
        } else if (this.balance >= transfer && to instanceof BankAccount) {
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

    @Override
    public String toString() {
        return String.valueOf(this.phone) + this.balance;
    }
}
