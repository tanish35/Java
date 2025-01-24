package ass1;

import java.util.ArrayList;

class BankAccount {
    private int accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(int accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
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

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "AccountNumber: " + accountNumber + ", OwnerName: " + ownerName + ", Balance: " + balance;
    }
}

class AccountManager {
    private ArrayList<BankAccount> accounts;

    public AccountManager() {
        accounts = new ArrayList<>();
    }

    public void createAccount(int accountNumber, String ownerName, double initialBalance) {
        BankAccount newAccount = new BankAccount(accountNumber, ownerName, initialBalance);
        accounts.add(newAccount);
    }

    public void deleteAccount(int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accountNumber) {
                accounts.remove(i);
                break;
            }
        }
    }

    public void deposit(int accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposit(amount);
                break;
            }
        }
    }

    public void withdraw(int accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.withdraw(amount);
                break;
            }
        }
    }

    public void printAllAccounts() {
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();

        accountManager.createAccount(1, "John Doe", 1000.0);
        accountManager.createAccount(2, "Jane Smith", 1500.0);
        accountManager.createAccount(3, "Alice Johnson", 2000.0);
        accountManager.createAccount(4, "Bob Brown", 2500.0);
        accountManager.createAccount(5, "Charlie Davis", 3000.0);

        accountManager.printAllAccounts();
    }
}