class Account {
    private int acc_no;
    private static int count = 1;
    private int balance;

    Account(int balance) {
        this.balance = balance;
        this.acc_no = count++;
    }

    public void withdraw(int amount) throws LowBalanceException {
        if (balance < amount) {
            throw new LowBalanceException(balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful");
    }
}

class LowBalanceException extends Exception {
    LowBalanceException(int amount) {
        System.out.println("Insufficient balance. Available balance: " + amount);
    }
}

public class test13 {

    public static void main(String[] args) {
        Account a = new Account(1000);
        try {
            a.withdraw(2000);
        } catch (LowBalanceException e) {
            System.out.println(e);
        }
    }

}
