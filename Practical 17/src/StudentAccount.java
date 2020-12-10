import java.text.NumberFormat;
import java.util.Locale;

public class StudentAccount extends Account {

    private static final int OVERDRAFT = 500;

    public StudentAccount(String accountNumber, String accountHolder) {
        super(accountNumber, accountHolder);
    }

    public boolean withdraw(double amount){
        if (amount > 0.0) {
            if (this.getBalance() - amount >= -OVERDRAFT) {
                this.setBalance(this.getBalance() - amount);
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    @Override
    void display() {
        final String formatString = "%-20s %12s %12s %10s %11s";
        NumberFormat gb = NumberFormat.getCurrencyInstance (Locale.UK);

        System.out.print (String.format (formatString, "Student Account", this.getAccountNumber (),
                this.getAccountHolder (), gb.format (this.getBalance ()),"true"));
    }

}


