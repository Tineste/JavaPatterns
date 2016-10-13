package orz.xuchao.javapatterns.singleton;

public class TestSingleton {

	public static void test(){
		EagerSingleton eagerSingleton=EagerSingleton.getInstance();
		eagerSingleton.singletonOperation();
		
		LazySingleton lazySingleton=LazySingleton.getInstance();
		lazySingleton.singletonOperation();
		
		Singleton1 singleton1=Singleton1.getInstance();
		singleton1.singletonOperation();
		
		Singleton2 singleton2=Singleton2.getInstance();
		singleton2.singletonOperation();
		
		Singleton3 singleton3=Singleton3.uniqueInstance;
		singleton3.singletonOperation();
	}
}
