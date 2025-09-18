public class Account {

    private double balance;

    public Account() {
        balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
        }
    }
    public double getBalance() {
        return balance;
    }
}
