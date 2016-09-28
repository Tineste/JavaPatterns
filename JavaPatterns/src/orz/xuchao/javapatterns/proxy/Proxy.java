package orz.xuchao.javapatterns.proxy;

public class Proxy implements Subject {

	public RealSubject realSubject;
	
	@Override
	public void requset() {
		realSubject=new RealSubject();
		realSubject.requset();
	}

}
