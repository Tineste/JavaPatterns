package orz.xuchao.javapatterns.singleton;

public class Singleton1 {
    private volatile static Singleton1 instance = null;
    private Singleton1(){}
    public static Singleton1 getInstance(){
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if(instance == null){
            //同步块，线程安全的创建实例
            synchronized (Singleton1.class) {
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if(instance == null){
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
  
	public void singletonOperation() {
		System.out.println("Singleton1");
	}
}