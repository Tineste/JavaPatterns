package orz.xuchao.javapatterns.prototype;

import java.io.IOException;

public class TestPrototype {
	
	public static void test() throws ClassNotFoundException, IOException{
		Prototype prototype=new ConcretePrototype();
		prototype.setName("aaaa");
		Enclosure enclosure=new Enclosure();
		enclosure.setMessage("message AAAA");
		prototype.setEnclosure(enclosure);
		
		
//		浅拷贝
		Prototype prototype1=prototype.clone();
		System.out.println(prototype.getName()+"   "+prototype.getEnclosure().getMessage());
		System.out.println(prototype1.getName()+"   "+prototype1.getEnclosure().getMessage());
		
		prototype.setName("bbb");
		prototype.getEnclosure().setMessage("message BBBB");
		
		System.out.println(prototype.getName()+"   "+prototype.getEnclosure().getMessage());
		System.out.println(prototype1.getName()+"   "+prototype1.getEnclosure().getMessage());
		
		System.out.println("-----------------------------------------------------");
//		深拷贝
		Prototype prototype2=(Prototype) prototype.deepClone();
		System.out.println(prototype.getName()+"   "+prototype.getEnclosure().getMessage());
		System.out.println(prototype2.getName()+"   "+prototype2.getEnclosure().getMessage());
		
		prototype.setName("bbb");
		prototype.getEnclosure().setMessage("message BBBB");
		
		System.out.println(prototype.getName()+"   "+prototype.getEnclosure().getMessage());
		System.out.println(prototype2.getName()+"   "+prototype2.getEnclosure().getMessage());
		
	}

}
