package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		

		TestBean2 t1 = ctx.getBean("obj5", TestBean2.class);
		System.out.println(t1);
		TestBean2 t2 = ctx.getBean("obj6", TestBean2.class);
		System.out.println(t2);
		TestBean2 t3 = ctx.getBean("obj7", TestBean2.class);
		System.out.println(t3);
		TestBean2 t4 = ctx.getBean("obj8", TestBean2.class);
		System.out.println(t4);
		
		TestBean3 t9 = ctx.getBean("obj9", TestBean3.class);
		System.out.println(t9.getA());
		ctx.close();
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		TestBean2 t5 = ctx2.getBean("obj1", TestBean2.class);
		t5.pr();
		
		TestBean2 t6 = ctx2.getBean("obj2", TestBean2.class);
		t6.pr();
		
		TestBean2 t7= ctx2.getBean("obj3", TestBean2.class);
		t7.pr();
		
		TestBean2 t8= ctx2.getBean("obj4", TestBean2.class);
		t8.pr();
		
		TestBean3 t10 = ctx2.getBean("obj5", TestBean3.class);

		TestBean3 t11 = ctx2.getBean("obj11", TestBean3.class);

		TestBean4 t12 = ctx2.getBean("obj12", TestBean4.class);
		System.out.println(t12.getData1());
		System.out.println(t12.getData2());
		ctx2.close();
	}

}
