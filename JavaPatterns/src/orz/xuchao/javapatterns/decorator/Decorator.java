package orz.xuchao.javapatterns.decorator;

public class Decorator extends Component {

	protected  Component component;
	public void setComponent(Component component) {
		this.component=component;
	}
	@Override
	public void Operation() {

		component.Operation();
	}

}
