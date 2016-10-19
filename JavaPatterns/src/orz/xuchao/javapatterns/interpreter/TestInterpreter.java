package orz.xuchao.javapatterns.interpreter;

import java.util.ArrayList;
import java.util.List;

public class TestInterpreter {
	public static void test(){
		Context context =new Context();
		
		context.setInput("Context:");
		
		
		List<AbstractExpression> list=new ArrayList<AbstractExpression>();
		
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());
		for (AbstractExpression abstractExpression : list) {
			abstractExpression.interpret(context);
		}
		
		
		
	}

}
