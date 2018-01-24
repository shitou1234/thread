package cn.shitou.threadLocal.javaThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2018/1/23.
 */
public class FixedThreadPoolTest {
    //创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
    private static void testFixedThreadPool() throws InterruptedException, ExecutionException {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            fixedThreadPool.execute(new Runnable() {
                public void run() {
                    try {
                        System.out.println(index);
                        Thread.sleep(2000);
//                        System.out.println("当前线程数：" + Runtime.getRuntime().availableProcessors());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        System.out.println("当前线程数：" + Runtime.getRuntime().availableProcessors());
        fixedThreadPool.shutdown();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        testFixedThreadPool();
    }
}
