package cn.shitou.thread.example;
import cn.shitou.thread.example.Animal.Calltoback;
/**
 * Created by Administrator on 2018/1/23.
 */
public class LetOneStop implements Calltoback {
    // 动物对象
    Animal an;

    // 获取动物对象，可以传入兔子或乌龟的实例
    public LetOneStop(Animal an) {
        this.an = an;
    }

    //让动物的线程停止
    public void win() {
        // 线程停止
        an.stop();
    }
}
