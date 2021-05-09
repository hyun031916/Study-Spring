package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.beans.TestBean5;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		//TestBean1 주소값 출력
		TestBean1 t1 = ctx.getBean("obj1", TestBean1.class);
		System.out.println("t1: "+ t1);
		
		TestBean2 t2 = ctx.getBean(TestBean2.class);
		System.out.println("t2: "+ t2);
		
		TestBean3 t3 = ctx.getBean(TestBean3.class);
		System.out.println("t3: "+ t3);
		
		TestBean3 t4 = ctx.getBean(TestBean3.class);
		System.out.println("t4: "+ t4);
		
		TestBean4 t5 = ctx.getBean(TestBean4.class);
		System.out.println(t5.getData4());
		System.out.println("t5: "+ t5);
		
		TestBean5 t6 = ctx.getBean("obj2",TestBean5.class);
		System.out.println(t6.getA());
		System.out.println(t6.getB());
		System.out.println(t6.getC());
		System.out.println(t6.getD());
		System.out.println("t6: "+ t6);
		
		TestBean5 t7 = ctx.getBean("obj2",TestBean5.class);
		System.out.println(t7.getA());
		System.out.println(t7.getB());
		System.out.println(t7.getC());
		System.out.println(t7.getD());
		System.out.println("t7: "+ t7);
		
		ctx.close();
		
		System.out.println("====================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		//TestBean1 주소값 출력
		TestBean1 java1 = ctx2.getBean("java1", TestBean1.class);
		System.out.println("java1: "+java1);
		
		TestBean2 java2 = ctx2.getBean("java2", TestBean2.class);
		System.out.println("java2: "+java2);
		
		TestBean3 java3 = ctx2.getBean("obj3", TestBean3.class);
		System.out.println("java3: "+java3);
		
		TestBean3 java4 = ctx2.getBean("obj3", TestBean3.class);
		System.out.println("java4: "+java4);
		
		TestBean4 java5 = ctx2.getBean(TestBean4.class);
		System.out.println("java5: "+java5);
		
		TestBean5 java6 = ctx2.getBean("java5",TestBean5.class);
		System.out.println("java6: "+java6);
		System.out.println("a: "+ java6.getA());
		
		ctx2.close();
	}

}
