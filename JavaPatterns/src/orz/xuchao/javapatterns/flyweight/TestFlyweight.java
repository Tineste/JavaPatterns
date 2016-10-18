package orz.xuchao.javapatterns.flyweight;

public class TestFlyweight {
	public static void test(){
		  // TODO Auto-generated method stub
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory(new Character('a'));
        fly.operation("First Call");
        
        fly = factory.factory(new Character('b'));
        fly.operation("Second Call");
        
        fly = factory.factory(new Character('a'));
        fly.operation("Third Call");
	}

}
