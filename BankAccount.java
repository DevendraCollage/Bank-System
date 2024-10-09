public class BankAccount {
    private long accountNumber;
    private double balance = 0;
    private String name;

    BankAccount(long accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double checkBankBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "[Name : " + name + " | Account Number : " + accountNumber + " | Balance : " + balance + "]";
    }

    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited : " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew : " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance!");
        }
    }
}