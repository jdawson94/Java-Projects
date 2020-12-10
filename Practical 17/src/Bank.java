import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account newAccount){
        this.accounts.add(newAccount);
    }

    public void totalBalance(){
        NumberFormat gb = NumberFormat.getCurrencyInstance (Locale.UK);
        double total =0.0;
        for (Account a: accounts){
            total += a.getBalance();
        }
        System.out.println("The total of all accounts is: " + gb.format(total));
    }

    public void accountsHeader(){
        final String formatString = "%-20s %12s %12s %10s %5s %5s";
        System.out.print (String.format (formatString, "Account Type", "Number",
                "Name", "Balance", "Int","Overdraft"));
        System.out.println();
    }

    public void show(){
        accountsHeader();
        for (Account a: accounts){
            a.display();
            System.out.println();
        }
        System.out.println();
    }

    public void showOverdrawn(){
        accountsHeader();
        for (Account a: accounts){
            if (a.getBalance() < 0){
                a.display();
                System.out.println();
            }
        }
        System.out.println();
    }

    public void showStudentAccounts() {
        accountsHeader();
        for (Account a : accounts) {
            if (a instanceof StudentAccount) {
                a.display();
                System.out.println();
            }
        }
    }

}
