package orz.xuchao.javapatterns.proxy;

public class RealSubject implements Subject {

	@Override
	public void requset() {
		System.out.println("真实请求");
	}

}
