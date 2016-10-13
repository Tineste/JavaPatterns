package orz.xuchao.javapatterns.singleton;

public enum Singleton3 {
    /**
     * 定义一个枚举的元素，它就代表了Singleton的一个实例。
     */
    
    uniqueInstance;
    
    /**
     * 单例可以有自己的操作
     */
    public void singletonOperation(){
        //功能处理
    	System.out.println("Singleton3");
    }
}