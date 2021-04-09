package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// xml 설정
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t01 = ctx1.getBean("obj1", TestBean1.class);
		System.out.println("t01.data"+ t01.getData1());
		
		TestBean1 t02 = ctx1.getBean("obj2", TestBean1.class);
		System.out.println("t02.data"+ t02.getData1());
		ctx1.close();
				
		System.out.println("======================================");
				
//		java로 설정
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
//		
//		TestBean1 t1 = ctx2.getBean("java1", TestBean1.class);
//		System.out.println("t1.data: "+t1.getData1());
//		
//		TestBean1 t2 = ctx2.getBean("java2", TestBean1.class);
//		System.out.println("t2.data: "+t2.getData1());
		
		System.out.println("=================================");
		TestBean1 t3 = ctx2.getBean("java3", TestBean1.class);
		System.out.println("t3.data1: "+ t3.getData1());
		System.out.println("t3.data2: "+ t3.getData2());
		System.out.println("t3.data3: "+ t3.getData3());
		System.out.println("t3.data4: "+ t3.getData4());
				
		ctx2.close();
	}

}
