package orz.xuchao.javapatterns.simplefactory;

/**
 * 简单工厂模式
 * @author DragonKnight
 *
 */


public class TestSimpleFactory {

	public static void test(){
		Operation operation=OperationFactory.createOperate("+");
		operation.numberA=3;
		operation.numberB=2;
		System.out.println(operation.getResult());

		operation=OperationFactory.createOperate("-");
		operation.numberA=3;
		operation.numberB=2;
		System.out.println(operation.getResult());
	}
	
	
}
