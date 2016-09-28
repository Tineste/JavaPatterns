package orz.xuchao.javapatterns.decorator;

//基础类，只有一个operatiocn方法，现在想给他增加属性和方法


public class ConcreteComponent extends Component {

	@Override
	public void Operation() {
		System.out.println("具体对象操作");
	}

}
