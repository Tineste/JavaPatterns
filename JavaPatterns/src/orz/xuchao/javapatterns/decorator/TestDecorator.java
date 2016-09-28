package orz.xuchao.javapatterns.decorator;

public class TestDecorator {
	
	public static void Test(){
		ConcreteComponent component=new ConcreteComponent();
		ConcreteDecoratorA concreteDecoratorA=new ConcreteDecoratorA();
		ConcreteDecoratorB concreteDecoratorB=new ConcreteDecoratorB();
		concreteDecoratorA.setComponent(component);
		concreteDecoratorB.setComponent(concreteDecoratorA);
		concreteDecoratorB.Operation();

		}

}
