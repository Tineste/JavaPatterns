package orz.xuchao.javapatterns.decorator;

//获得了addedBehavior的方法

public class ConcreteDecoratorB extends Decorator {

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.Operation();
		System.out.println("具体装饰对象B的操作");
	}
	
	public void addedBehaviorB(){
		
	}

}
