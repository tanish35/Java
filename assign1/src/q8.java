import java.util.ArrayList;

class Account {
    private String holderName;
    private int accountNumber;
    private double balance;

    Account(String holderName, int accountNumber, double balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    String getHolderName() {
        return holderName;
    }

    double getBalance() {
        return balance;
    }

    void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "holderName='" + holderName + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    SavingsAccount(String holderName, int accountNumber, double balance, double interestRate) {
        super(holderName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    double calculateYearlyInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                ", " + super.toString() +
                '}';
    }
}

class CurrentAccount extends Account {

    CurrentAccount(String holderName, int accountNumber, double balance) {
        super(holderName, accountNumber, balance);
    }

    @Override
    public String toString() {
        return "CurrentAccount{" + super.toString() + '}';
    }
}

class Manager {
    private ArrayList<Account> accounts;

    Manager() {
        accounts = new ArrayList<>();
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    ArrayList<Account> getAccounts() {
        return accounts;
    }
}

public class q8 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Account account1 = new SavingsAccount("John", 1, 1000.0, 0.1);
        manager.addAccount(account1);
        Account account2 = new SavingsAccount("Tanish", 2, 2000.0, 0.2);
        manager.addAccount(account2);
        Account account3 = new CurrentAccount("Rahul", 3, 3000.0);
        manager.addAccount(account3);
        Account account4 = new CurrentAccount("Rohit", 4, 4000.0);
        manager.addAccount(account4);
        Account account5 = new CurrentAccount("Lana del Ray", 5, 5000.0);
        manager.addAccount(account5);
        for (Account account : manager.getAccounts()) {
            if (account instanceof SavingsAccount) {
                SavingsAccount sa = (SavingsAccount) account;
                System.out.println("Yearly Interest for " + sa.getHolderName() + ": $" + sa.calculateYearlyInterest());
            }
        }
        System.out.println("\nAll Account Details:");
        for (Account account : manager.getAccounts()) {
            System.out.println(account);
        }
    }
}
