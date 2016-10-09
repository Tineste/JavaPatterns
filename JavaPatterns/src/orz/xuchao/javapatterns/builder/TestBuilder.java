package orz.xuchao.javapatterns.builder;

public class TestBuilder {

/**
 * 工厂模式，一般第二个的那个用的比较多
 */
	
	
	public static void test() {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct();
		Product product = builder.retrieveResult();
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());

		System.out.println("-----------------------------------");

		// 创建构建器对象
		InsuranceContract.ConcreteBuilder builder2 = new InsuranceContract.ConcreteBuilder("9527", 123L, 456L);
		// 设置需要的数据，然后构建保险合同对象
		InsuranceContract contract = builder2.setPersonName("小明").setOtherData("test").build();
		// 操作保险合同对象的方法
		contract.someOperation();
	}

}
