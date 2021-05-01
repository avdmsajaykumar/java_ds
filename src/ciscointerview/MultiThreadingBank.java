package ciscointerview;

public class MultiThreadingBank {

    public static void main(String[] args) {

        BankDeposit bd = new BankDeposit();
        BankWithdraw bw = new BankWithdraw();
        Thread t1 = new Thread(bd, "one");
        Thread t2 = new Thread(bw, "two");

        t1.start();
        t2.start();

    }
}

class BankDeposit implements Runnable {

    Bank bank = Bank.getInstance();

    @Override
    public void run() {
        try {
            depositAmount(10);
            depositAmount(200);
            depositAmount(100);
            depositAmount(20000);
            depositAmount(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void depositAmount(int amount) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("depositing " + amount);
        bank.deposit(amount);
        synchronized (bank) {
            bank.notify();
        }
    }
}

class BankWithdraw implements Runnable {

    Bank bank = Bank.getInstance();

    private void withdrawAmount(int amount) throws InterruptedException {
        while (amount > bank.getMoney()) {
            synchronized (bank) {
                bank.wait();
            }
        }
        System.out.println(bank.withdraw(amount));
    }

    @Override
    public void run() {
        try {
            withdrawAmount(150);
            withdrawAmount(500);
            withdrawAmount(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Bank {

    private static Bank bank;

    public int getMoney() {
        return money;
    }

    private int money = 0;

    public void deposit(int amount) {
        money = money + amount;
    }

    public String withdraw(int amount) {
        money = money - amount;
        return String.valueOf(amount);
    }

    private Bank() {

    }

    public static Bank getInstance() {
        if (bank == null) {
            bank = new Bank();
        }
        return bank;
    }

}



