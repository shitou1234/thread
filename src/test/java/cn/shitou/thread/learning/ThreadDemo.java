package cn.shitou.thread.test;


import cn.shitou.thread.learning.Thread1;
import org.junit.Test;

/**
 * Created by Administrator on 2018/1/23.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("A");
        Thread1 t2 = new Thread1("B");
        t1.start();
        t2.start();
    }

    @Test
    public void test1(){
        Thread1 t1 = new Thread1("A");
        Thread1 t2 = new Thread1("B");
        t1.start();
        t2.start();

    }
}
