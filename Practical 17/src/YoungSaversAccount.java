import java.text.NumberFormat;
import java.util.Locale;

public class YoungSaversAccount extends Account {

    private int interest;

    public YoungSaversAccount(String accountNumber, String accountHolder, int interest) {
        super(accountNumber, accountHolder);
        this.interest = interest;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    @Override
    public boolean deposit(double amount){
        if (amount > 0.0 && this.getBalance() + amount <= 100) {
            this.setBalance(this.getBalance()+ amount);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean withdraw(double amount){
        if (amount > 0.0 && this.getBalance() - amount > 0) {
            this.setBalance(this.getBalance() - amount);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean addInterest(){
        if (this.interest > 0 && this.getBalance() > 0.0){
            this.setBalance(this.getBalance() + (this.getBalance() * (this.interest /100.0)));
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    void display() {
        final String formatString = "%-20s %12s %12s %10s %5s";
        NumberFormat gb = NumberFormat.getCurrencyInstance (Locale.UK);

        System.out.print (String.format (formatString, "Young Savers Account", this.getAccountNumber (),
                this.getAccountHolder (), gb.format (this.getBalance ()), this.getInterest()));
    }

}
