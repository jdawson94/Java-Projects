import java.util.Random;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private boolean hasOverdraft;

    public BankAccount (String accountHolder){
        this.accountNumber = generateAccountNumber();
        this.accountHolder = accountHolder;
    }

    public BankAccount(String accountNumber, String accountHolder, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.hasOverdraft = hasOverdraft;
    }

    public BankAccount(String accountNumber, String accountHolder, double balance, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isHasOverdraft() {
        return hasOverdraft;
    }

    public void setHasOverdraft(boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public boolean deposit(double amount){
        if (amount > 0.0) {
            this.balance += amount;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean withdraw(double amount){
        if (amount > 0.0) {
            if (this.balance - amount >= 0 || isHasOverdraft()) {
                this.balance -= amount;
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

    public boolean addInterest(int interest){
        if (interest > 0 && this.balance > 0.0){
            this.balance += (this.getBalance() * (interest / 100.0));
            return true;
        }
        else {
            return false;
        }
    }

    private String generateAccountNumber(){
        String acc = " ";
        Random rg = new Random();
        for (int i = 0; i < 9; i++){
            acc += rg.nextInt(10);
        }
        return acc;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                ", hasOverdraft=" + hasOverdraft +
                '}';
    }

}
