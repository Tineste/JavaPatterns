package orz.xuchao.javapatterns.adapter;

public class TestAdapter {

	public static void test(){
		
		
		Target target=new Adapter1();
		target.sampleOperation1();
		target.sampleOperation2();
		
		
		Adaptee adaptee=new Adaptee();
		target=new Adapter2(adaptee);
		target.sampleOperation1();
		target.sampleOperation2();
		
	}
	
}
