package orz.xuchao.javapatterns.simplefactory;

public class OperationFactory {

	private static Operation operation;

	public static Operation createOperate(String operate) {
		switch (operate) {
		case "+":

			operation=new AddOperation();
			break;
		case "-":

			operation=new ReduceOperation();
			break;

		default:
			break;
		}
		
		return operation;

	}

}
