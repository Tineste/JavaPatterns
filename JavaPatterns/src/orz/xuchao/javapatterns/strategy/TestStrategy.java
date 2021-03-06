package orz.xuchao.javapatterns.strategy;

/**
 * 策略模式
 * @author DragonKnight
 *
 */

public class TestStrategy {

	public static void test(){
		Context context;
		context=new Context(new ConcreteStrategyA());
		context.ContextInterface();
		
		context=new Context(new ConcreteStrategyB());
		context.ContextInterface();
	}
}
