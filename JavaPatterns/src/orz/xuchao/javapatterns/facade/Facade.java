package orz.xuchao.javapatterns.facade;

public class Facade {
	
	public SubSystemA subSystemA;
	public SubSystemB subSystemB;
	

	public void test(){
		SubSystemA subSystemA=new SubSystemA();
		subSystemA.methodA();
		
		
		SubSystemB subSystemB=new SubSystemB();
		subSystemB.methodB();
	}
}
