package orz.xuchao.javapatterns.factorymethod;

public class ConcreteCreatorA extends Creator {

	@Override
	public Product FactoryMethod() {
		
		return new ConcreteProductA();
	}

}
