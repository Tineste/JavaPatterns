package orz.xuchao.javapatterns.adapter;

public class Adapter1 extends Adaptee implements Target {

    /**
     * 由于源类Adaptee没有方法sampleOperation2()
     * 因此适配器补充上这个方法
     */
    @Override
    public void sampleOperation2() {
        System.out.println("源类上新增的方法");
    }

	

}
