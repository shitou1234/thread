package cn.shitou.thread.test;


import cn.shitou.thread.learning.Thread2;
import org.junit.Test;

/**
 * Created by Administrator on 2018/1/23.
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread2 t1 = new Thread2("A");
        Thread2 t2 = new Thread2("B");
        new Thread(t1).start();
        new Thread(t2).start();
    }

    @Test
    public void test1(){
        Thread2 t1 = new Thread2("A");
        Thread2 t2 = new Thread2("B");
        new Thread(t1).start();
        new Thread(t2).start();

    }
}
