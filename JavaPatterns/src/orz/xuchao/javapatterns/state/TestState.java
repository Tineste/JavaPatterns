package orz.xuchao.javapatterns.state;

public class TestState {
	public static void test(){
		 //创建状态
		State stateA = new ConcreteStateA();
		State stateB = new ConcreteStateB();
        //创建环境
        Context context = new Context();
        //将状态设置到环境中
        context.setState(stateA);
        //请求
        context.request("test");
        
        context.setState(stateB);
        context.request("test");
        
	}

}
