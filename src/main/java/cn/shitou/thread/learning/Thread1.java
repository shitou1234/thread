package cn.shitou.thread.learning;

/**
 * Created by Administrator on 2018/1/23.
 */
public class Thread1 extends Thread {
    private String name;

    public Thread1(String name) {
        this.name = name;
    }

    @Override
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
