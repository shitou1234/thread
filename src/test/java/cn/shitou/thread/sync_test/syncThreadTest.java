package cn.shitou.thread.sync_test;

import cn.shitou.thread.synchronized_demo.Counter;
import cn.shitou.thread.synchronized_demo.SyncThread;

/**
 * Created by Administrator on 2018/1/23.
 */
public class syncThreadTest {
//    public static void main(String[] args) {
//        SyncThread syncThread1 = new SyncThread();
//        SyncThread syncThread2 = new SyncThread();
//        Thread t1 = new Thread(syncThread1,"thread-1");
//        Thread t2 = new Thread(syncThread2,"thread-2");
//        t1.start();
//        t2.start();
//    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(counter, "A");
        Thread thread2 = new Thread(counter, "B");
        thread1.start();
        thread2.start();
    }
}
