package orz.xuchao.javapatterns.Mediator;

public class ConcreteMediator implements Mediator {
    //持有并维护同事A
    private ConcreteColleagueA colleagueA;
    //持有并维护同事B
    private ConcreteColleagueB colleagueB;    
    
    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void changed(Colleague c) {
        
    	if(c instanceof ConcreteColleagueA){
    		this.colleagueB.setPrintlnStr("我是colleagueB，我被ConcreteColleagueA改变了");
    		
    	}else if(c instanceof ConcreteColleagueB){
    		this.colleagueA.setPrintlnStr("我是colleagueA，我被ConcreteColleagueB改变了");
    	}
    	
    	
    }

}