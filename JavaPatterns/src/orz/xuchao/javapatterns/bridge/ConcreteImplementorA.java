package orz.xuchao.javapatterns.bridge;

public class ConcreteImplementorA extends Implementor {

    @Override
    public void operationImpl() {
        //具体操作
    	System.out.println("ConcreteImplementorA operationImpl");
    }

}
