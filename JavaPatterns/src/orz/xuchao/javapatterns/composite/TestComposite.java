package orz.xuchao.javapatterns.composite;

import orz.xuchao.javapatterns.composite.safety.TestSafetyComposite;
import orz.xuchao.javapatterns.composite.transparent.TestTransparentComposite;
/**
 * 组合模式
 * @author DragonKnight
 *
 */
public class TestComposite {
	public static void test(){
		TestSafetyComposite.test();
		System.out.println("---------");
		TestTransparentComposite.test();
	}

}
