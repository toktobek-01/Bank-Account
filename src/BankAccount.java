public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(50);

        account.deposit(30);            // balance: 80
        account.withdraw(20);           // balance: 60
        account.withdraw(100);          // too much!
        account.deposit(-10);           // invalid

        System.out.println("Final Balance: " + account.getBalance());
    }
}
