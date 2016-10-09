package orz.xuchao.javapatterns.decorator;

/**
 * 装饰模式
 * @author DragonKnight
 *
 */
public class TestDecorator {
	
	public static void test(){
		ConcreteComponent component=new ConcreteComponent();
		ConcreteDecoratorA concreteDecoratorA=new ConcreteDecoratorA();
		ConcreteDecoratorB concreteDecoratorB=new ConcreteDecoratorB();
		concreteDecoratorA.setComponent(component);
		concreteDecoratorB.setComponent(concreteDecoratorA);
		concreteDecoratorB.Operation();

		}

}