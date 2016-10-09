package orz.xuchao.javapatterns.observer;

import java.util.Observer;

/**
 * 观察者模式
 * 
 * java自带的有，可看源代码也不多就那么几行，观察者模式还可以分推和拉，
 * 推就是把消息一个一个推过去，
 * 拉就是随便推一个消息通知它自己去对应位置拉
 * 自己需要的数据
 * 
 * @author DragonKnight
 *
 */


public class TestObserver {
	
	public static void test(){
        //创建被观察者对象
        Watched watched = new Watched();
        //创建观察者对象，并将被观察者对象登记
        Observer watcher = new Watcher(watched);
        //给被观察者状态赋值
        watched.setData("start");
        watched.setData("run");
        watched.setData("stop");
	}

}
