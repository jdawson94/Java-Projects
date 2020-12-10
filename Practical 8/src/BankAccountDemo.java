public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount joe = new BankAccount("1234","Joe",true);
        BankAccount keith = new BankAccount("5678","Keith",100,false);
        BankAccount ed = new BankAccount("Ed");

        joe.deposit(600);
        System.out.println(joe);
        joe.addInterest(2);
        System.out.println(joe); //612 now in account
        joe.withdraw(630);
        System.out.println(joe); //balance should now be negative since joe has an overdraft

        keith.withdraw(102);
        System.out.println(keith); //keith should still have 100 in balance as the withdrawal should fail.

        System.out.println(ed);

    }
}
