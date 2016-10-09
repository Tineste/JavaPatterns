package orz.xuchao.javapatterns.templatemethod;

/**
 * 模板方法模式
 * @author DragonKnight
 *
 */

public class TestTemplateMethod {

	public static void test() {
		ConcrereClassA abstractClassA = new ConcrereClassA();
		abstractClassA.templateMethod();

		AbstractClass abstractClassB = new ConcrereClassB();
		abstractClassB.templateMethod();
	}
}