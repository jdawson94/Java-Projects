public class DepositAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public DepositAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public DepositAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
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
        if (amount > 0.0 && this.balance - amount > 0) {
                this.balance -= amount;
                return true;
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

    @Override
    public String toString() {
        return "DepositAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }

}
