package orz.xuchao.javapatterns.abstractfactory;

import orz.xuchao.javapatterns.proxy.Subject;

public class ConcreteFactory2 implements AbstractFactory {

	@Override
	public AbstractProductA CreateProductA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	@Override
	public AbstractProductB CreateProductB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}




}
