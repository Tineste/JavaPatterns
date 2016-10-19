package orz.xuchao.javapatterns.interpreter;

public class TerminalExpression extends AbstractExpression{

	@Override
	public void interpret(Context context) {
		
		System.out.println(context.getInput()+"非终端解释器");
	}

}
