package ciscointerview;

public class MultiThreading {
    public static final Account account = new Account();
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {

            try {
            account.Deposit(50);
//            Thread.sleep(1000);
            account.Deposit(500);
//            Thread.sleep(1000);
            account.Deposit(700);
//            Thread.sleep(1000);
            account.Deposit(800);
            Thread.sleep(1000);
            account.Deposit(300);
//            Thread.sleep(1000);
            account.Deposit(100);
//            Thread.sleep(1000);
            account.Deposit(100);
            Thread.sleep(1000);
            account.Deposit(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                account.Withdraw(1000);
                account.Withdraw(500);
                account.Withdraw(200);
                account.Withdraw(300);
                account.Withdraw(5000);
                account.Withdraw(200);
                account.Withdraw(300);
                account.Withdraw(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t2.start();
        t1.start();
    }

}

class Account {

    private int Balance = 0;

    public void addBalance(int value) {
        Balance += value;
    }

    public int getBalance() {
        return Balance;
    }

    public String withdrawBalance(int value) {
        Balance -= value;
        return Integer.toString(Balance);
    }
    synchronized public void Deposit(int value){
        addBalance(value);
        notify();
        System.out.println("Value is added to the account, current balance is " + getBalance());
    }

    synchronized public void Withdraw(int value) throws InterruptedException {
        while (getBalance() < value) {
            wait();
        }
        System.out.println("Current balance after withdraw " + withdrawBalance(value));
    }
}
