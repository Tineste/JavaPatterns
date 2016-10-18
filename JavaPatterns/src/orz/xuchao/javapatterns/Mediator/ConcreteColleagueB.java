package orz.xuchao.javapatterns.Mediator;

public class ConcreteColleagueB extends Colleague {
	private String str="ConcreteColleagueB";
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }
    /**
     * 示意方法，执行某些操作
     */
    public void operation(){
        //在需要跟其他同事通信的时候，通知调停者对象
        getMediator().changed(this);
    }
    
    public void setPrintlnStr(String str){
    	this.str=str;
    }
    
    public void println( ){
    	System.out.println(str);
    }
}