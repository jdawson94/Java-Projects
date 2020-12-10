public class BankDemo {

    public static void main(String[] args) {
        CurrentAccount bob = new CurrentAccount("123","Bob",false);
        DepositAccount alan = new DepositAccount("456","Alan",0);
        StudentAccount chris = new StudentAccount("789","Chris");
        YoungSaversAccount dave = new YoungSaversAccount("111","Dave",2);
        CurrentAccount ed = new CurrentAccount("222","Ed",true);

        Bank halifax = new Bank();
        halifax.addAccount(bob);
        halifax.addAccount(alan);
        halifax.addAccount(chris);
        halifax.addAccount(dave);
        halifax.addAccount(ed);

        halifax.show();

        bob.deposit(50);
        alan.deposit(40);
        chris.withdraw(499);
        dave.deposit(30);
        dave.addInterest();
        ed.withdraw(10);
        halifax.show();

        halifax.totalBalance();

        halifax.showOverdrawn();
        halifax.showStudentAccounts();

    }
}
