package orz.xuchao.javapatterns.abstractfactory;

import orz.xuchao.javapatterns.proxy.Subject;

public class ConcreteFactory1 implements AbstractFactory {

	@Override
	public AbstractProductA CreateProductA() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

	@Override
	public AbstractProductB CreateProductB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}




}
