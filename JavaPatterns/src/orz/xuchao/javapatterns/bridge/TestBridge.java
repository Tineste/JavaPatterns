package orz.xuchao.javapatterns.bridge;

public class TestBridge {
	
	static RefinedAbstraction refinedAbstraction;
	public static void test(){
		
		
		refinedAbstraction=new RefinedAbstraction(new ConcreteImplementorA());
		refinedAbstraction.operation();
		refinedAbstraction.otherOperation();
		
		refinedAbstraction=new RefinedAbstraction(new ConcreteImplementorB());
		refinedAbstraction.operation();
		refinedAbstraction.otherOperation();
		
	}

}
