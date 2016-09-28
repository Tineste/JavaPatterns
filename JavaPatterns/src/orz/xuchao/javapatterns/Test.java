package orz.xuchao.javapatterns;

import orz.xuchao.javapatterns.simplefactory.TestSimpleFactory;
import orz.xuchao.javapatterns.strategy.TestStrategy;

public class Test {

	public static void main(String[] args) {
//		简单工厂模式
		TestSimpleFactory.Test();
		
//		策略模式
		TestStrategy.Test();
		
	}
}
