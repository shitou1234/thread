package cn.shitou.threadLocal.javaThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2018/1/23.
 */
public class SingleThreadExecutorTest {
    //创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
    private static void testSingleThreadExecutor() throws InterruptedException, ExecutionException {
        ExecutorService singleThreadExecutor = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            final int index = i;
            singleThreadExecutor.execute(new Runnable() {
                public void run() {
                    while (true) {
                        System.out.println(index);
                        try {
                            Thread.sleep(5 * 1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            });
            Thread.sleep(500);
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        testSingleThreadExecutor();
    }
}
