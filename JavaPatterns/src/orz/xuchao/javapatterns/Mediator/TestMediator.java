package orz.xuchao.javapatterns.Mediator;

public class TestMediator {
	public static void test(){
		
		ConcreteMediator concreteMediator=new ConcreteMediator();
		
		ConcreteColleagueA colleagueA=new ConcreteColleagueA(concreteMediator);
		ConcreteColleagueB colleagueB=new ConcreteColleagueB(concreteMediator);
				
		colleagueA.println();
		colleagueB.println();
		
		concreteMediator.setColleagueA(colleagueA);
		concreteMediator.setColleagueB(colleagueB);
				
		colleagueA.operation();
		colleagueB.operation();
				
		colleagueA.println();
		colleagueB.println();
		
	}

}
