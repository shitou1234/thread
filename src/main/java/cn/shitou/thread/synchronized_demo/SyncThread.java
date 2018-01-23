package cn.shitou.thread.synchronized_demo;

/**
 * Created by Administrator on 2018/1/23.
 * Java中Synchronized的用法  http://blog.csdn.net/luoweifu/article/details/46613015
 */
public class SyncThread implements Runnable{
    private static int count;

    public SyncThread() {
        count = 0;
    }

    public  void run() {
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int getCount() {
        return count;
    }
}
