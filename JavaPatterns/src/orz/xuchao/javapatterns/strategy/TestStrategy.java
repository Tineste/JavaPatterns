package orz.xuchao.javapatterns.strategy;

public class TestStrategy {

	public static void Test(){
		Context context;
		context=new Context(new ConcreteStrategyA());
		context.ContextInterface();
		
		context=new Context(new ConcreteStrategyB());
		context.ContextInterface();
	}
}
