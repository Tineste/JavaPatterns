package orz.xuchao.javapatterns.interpreter;

public class NonterminalExpression extends AbstractExpression{

	@Override
	public void interpret(Context context) {
		
		System.out.println(context.getInput()+"终端解释器");
	}

}