import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addBankAccount(BankAccount ba) {
        accounts.add(ba);
    }

    public void printAllAccount() {
        for (BankAccount ba : accounts) {
            System.out.println(ba);
        }
    }

    public BankAccount SelectAccount(long accountNumber) {
        for (BankAccount ba : accounts) {
            if (ba.getAccountNumber() == accountNumber) {
                return ba;
            }
        }
        return null;
    }
}