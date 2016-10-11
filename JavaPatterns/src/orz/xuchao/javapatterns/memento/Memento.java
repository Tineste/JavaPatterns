package orz.xuchao.javapatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
	 private List<String> states;
	    private int index;
	    /**
	     * 构造函数
	     */
	    public Memento(List<String> states , int index){
	        this.states = new ArrayList<String>(states);
	        this.index = index;
	    }
	    public List<String> getStates() {
	        return states;
	    }
	    public int getIndex() {
	        return index;
	    }
}
