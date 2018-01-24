package cn.shitou.thread.synchronized_demo;

/**
 * Created by Administrator on 2018/1/23.
 */
public class AccountOperator implements  Runnable{

    private Account account;
    public AccountOperator(Account account) {
        this.account = account;
    }

    public void run() {
        synchronized (account) {
            account.deposit(500);
            account.withdraw(500);
            System.out.println(Thread.currentThread().getName() + ":" + account.getBalance());
        }
    }
}
