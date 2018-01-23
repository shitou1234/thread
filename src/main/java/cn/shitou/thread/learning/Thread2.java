package cn.shitou.thread.learning;

import static java.lang.Thread.sleep;

/**
 * Created by Administrator on 2018/1/23.
 */
public class Thread2 implements Runnable{
    private String name;
    public Thread2(String name){
        this.name = name;
    }
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println("运行线程"+name+"---"+i);
        }
        try {
            sleep((int)Math.random()*1000+1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
