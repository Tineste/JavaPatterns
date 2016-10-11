package orz.xuchao.javapatterns.adapter;

public class Adapter2 extends Adaptee implements Target {

    private Adaptee adaptee;
    
    public Adapter2(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    /**
     * 源类Adaptee有方法sampleOperation1
     * 因此适配器类直接委派即可
     */
    public void sampleOperation1(){
        this.adaptee.sampleOperation1();
    }
    /**
     * 源类Adaptee没有方法sampleOperation2
     * 因此由适配器类需要补充此方法
     */
    public void sampleOperation2(){
    	System.out.println("源类上新增的方法");
    }
}

