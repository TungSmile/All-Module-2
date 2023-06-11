import java.util.*;
import java.io.*;

public class TransactionProcessing {
    private ArrayList<Payment> paymentObjects=new ArrayList<>();
    private IDCardManagement idcm;

    public TransactionProcessing(String idCardPath, String paymentPath) {
        idcm = new IDCardManagement(idCardPath);
        readPaymentObject(paymentPath);

    }

    public ArrayList<Payment> getPaymentObject() {
        return this.paymentObjects;
    }

    // Requirement 3
    public boolean readPaymentObject(String path) {
        try (
                FileReader fileReader = new FileReader(path);
                BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            while (bufferedReader.readLine() != null) {
                String line = bufferedReader.readLine();
                if (line.length() == 6) {
                    for (IDCard idCard : idcm.getIDCards()) {
                        if (idCard.getId() == Integer.parseInt(line)) {
                            getPaymentObject().add(new ConvenientCard(idCard));
                        }
                    }
                } else if (line.length() == 7) {
                    getPaymentObject().add(new EWallet(Integer.parseInt(line)));
                } else if (line.length() > 7) {
                    String[] temp = line.split(",");

                    getPaymentObject().add(new BankAccount(Integer.parseInt(temp[0]),Double.parseDouble(temp[1])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (CannotCreateCard e) {
            throw new RuntimeException(e);
        }


        return true;
    }

    // Requirement 4
    public ArrayList<ConvenientCard> getAdultConvenientCards() {
        //code here
        return null;
    }

    // Requirement 5
    public ArrayList<IDCard> getCustomersHaveBoth() {
        //code here
        return null;
    }

    // Requirement 6
    public void processTopUp(String path) {
        //code here
    }

    // Requirement 7
    public ArrayList<Bill> getUnsuccessfulTransactions(String path) {
        //code here
        return null;
    }

    // Requirement 8
    public ArrayList<BankAccount> getLargestPaymentByBA(String path) {
        //code here
        return null;
    }

    //Requirement 9
    public void processTransactionWithDiscount(String path) {
        //code here
    }
}
