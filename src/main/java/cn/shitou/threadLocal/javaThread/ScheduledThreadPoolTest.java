package cn.shitou.threadLocal.javaThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/1/23.
 */
public class ScheduledThreadPoolTest {
    //创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
    private static void testScheduledThreadPool() throws InterruptedException, ExecutionException {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("delay 1 seconds, and excute every 3 seconds");
            }
        }, 1, 3, TimeUnit.SECONDS);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        testScheduledThreadPool();
    }
}
