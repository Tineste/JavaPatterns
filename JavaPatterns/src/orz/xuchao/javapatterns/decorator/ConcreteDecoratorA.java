package orz.xuchao.javapatterns.decorator;

//获得了addedState属性

public class ConcreteDecoratorA extends Decorator {

	public String  addedState;

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.Operation();
		addedState="New State";
		System.out.println("具体装饰对象A的操作");
	}
	public void addedBehaviorA(){
		
	}
}