package cn.shitou.thread.example_test;

import cn.shitou.thread.example.Station;

/**
 * Created by Administrator on 2018/1/23.
 */
public class Test {
    /**
     * java多线程同步锁的使用
     * 示例：三个售票窗口同时出售10张票
     * */
    public static void main(String[] args) {
        //实例化站台对象，并为每一个站台取名字
        Station station1=new Station("窗口1");
        Station station2=new Station("窗口2");
        Station station3=new Station("窗口3");

        // 让每一个站台对象各自开始工作
        station1.start();
        station2.start();
        station3.start();

    }
}
