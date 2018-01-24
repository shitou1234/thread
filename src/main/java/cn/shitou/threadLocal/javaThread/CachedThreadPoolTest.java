package cn.shitou.threadLocal.javaThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2018/1/23.
 */
public class CachedThreadPoolTest {
    //创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
    private static void testCachedThreadPool() throws InterruptedException, ExecutionException {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            Thread.sleep(index * 1000);
            cachedThreadPool.execute(new Runnable() {
                public void run() {
                    System.out.println(index);
                }
            });
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        testCachedThreadPool();
    }
}
