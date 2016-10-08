package orz.xuchao.javapatterns.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//深拷贝，需要的序列化接口
import java.io.Serializable;

public class ConcretePrototype implements Prototype,Cloneable,Serializable{
	
	private String name;
	private Enclosure enclosure;
	
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	  public  Object deepClone() throws IOException, ClassNotFoundException{
	        //将对象写到流里
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        ObjectOutputStream oos = new ObjectOutputStream(bos);
	        oos.writeObject(this);
	        //从流里读回来
	        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
	        ObjectInputStream ois = new ObjectInputStream(bis);
	        return ois.readObject();
	    }
	
	

	@SuppressWarnings("finally")
	public Prototype clone(){
	        //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
	        Prototype prototype=null;
			try {
				prototype = (Prototype) super.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				 return prototype;
			}
	       
	    }

	@Override
	public Enclosure getEnclosure() {
		// TODO Auto-generated method stub
		return enclosure;
	}

	@Override
	public void setEnclosure(Enclosure enclosure) {
		this.enclosure = enclosure;
		
	}

}
