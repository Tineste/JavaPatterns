package orz.xuchao.javapatterns.factorymethod;

/**
 * 工程方法模式
 * @author DragonKnight
 *
 */


public class TestFactoryMethod {

	public static void test(){
		Creator creatorA=new ConcreteCreatorA();
		
		Product productA=creatorA.FactoryMethod();
		
		productA.name();
		
		Creator creatorB=new ConcreteCreatorB();
		
		Product productB=creatorB.FactoryMethod();
		
		productB.name();
		
	}
}
