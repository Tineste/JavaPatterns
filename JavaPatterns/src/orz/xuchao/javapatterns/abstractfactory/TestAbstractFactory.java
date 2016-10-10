package orz.xuchao.javapatterns.abstractfactory;
/**
 * 抽象工厂模式
 * @author DragonKnight
 *
 */

public class TestAbstractFactory {
	public static void test(){
		
		AbstractFactory concreteFactory=new ConcreteFactory1();
		concreteFactory.CreateProductA().doSomething();
		concreteFactory.CreateProductB().saySomething();
		
		
		concreteFactory=new ConcreteFactory2();
		concreteFactory.CreateProductA().doSomething();
		concreteFactory.CreateProductB().saySomething();
		
		
	}

}
