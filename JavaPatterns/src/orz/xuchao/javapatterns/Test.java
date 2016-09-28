package orz.xuchao.javapatterns;

import orz.xuchao.javapatterns.decorator.TestDecorator;
import orz.xuchao.javapatterns.proxy.TestProxy;
import orz.xuchao.javapatterns.simplefactory.TestSimpleFactory;
import orz.xuchao.javapatterns.strategy.TestStrategy;

public class Test {

	public static void main(String[] args) {
////		简单工厂模式
//		TestSimpleFactory.Test();
////		策略模式
//		TestStrategy.Test();
////		装饰模式
//		TestDecorator.Test();
//		代理模式
		TestProxy.Test();
		
	}
}
