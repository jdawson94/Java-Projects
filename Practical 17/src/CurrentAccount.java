import java.text.NumberFormat;
import java.util.Locale;

public class CurrentAccount extends Account {

    private boolean hasOverdraft;

    public CurrentAccount(String accountNumber, String accountHolder, boolean hasOverdraft) {
        super(accountNumber, accountHolder);
        this.hasOverdraft = hasOverdraft;
    }

    public boolean isHasOverdraft() {
        return hasOverdraft;
    }

    public void setHasOverdraft(boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public boolean withdraw(double amount){
        if (amount > 0.0) {
            if (this.getBalance() - amount >= 0 || isHasOverdraft()) {
                this.setBalance(getBalance() - amount);
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

        System.out.print (String.format (formatString, "Current Account", this.getAccountNumber (),
                this.getAccountHolder (), gb.format (this.getBalance ()), this.isHasOverdraft()));
    }
}
