public class BankAccount {
    private double balance;
    private final String accountHolder;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return accountHolder + " balance: " + balance;
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("My Account", 500);
        myAccount.deposit(100);
        System.out.println(myAccount);

        BankAccount larryAccount = new BankAccount("Larry", 5000);
        BankAccount maryAccount = new BankAccount("Mary", 300);

        larryAccount.withdraw(100);
        maryAccount.deposit(100);

        System.out.println(larryAccount);
        System.out.println(maryAccount);
    }
}
