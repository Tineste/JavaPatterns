package orz.xuchao.javapatterns.prototype;

import java.io.Serializable;

public class Enclosure  implements Serializable {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
