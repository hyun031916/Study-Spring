package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.beans.TestBean;

public class MainClass {
	public static void main(String[] args) {

		// 컨테이너의 config.xml 파일을 읽어온다.
		// singleton : 객체는 한번 가져오면 계속 사용된다. 새로 생성되지 않는다.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		/*
		 * // 커테이너에 있는 객체를 가지고 온다. (getBean) // getBean()의 리턴값 : Object TestBean
		 * t1=ctx.getBean(TestBean.class); t1.method();
		 * 
		 * TestBean t2=(TestBean) ctx.getBean("t2"); // 다운 캐스팅
		 * 
		 * Test t2= ctx.getBean("t2",TestBean.class); // 이 방법 더 많이 사용 // 부모의 참조 변수로 자식을
		 * 가리킨다. (다형성) t2.method(); System.out.println("T2 : " + t2);
		 * 
		 * 
		 * Test t3=ctx.getBean("t2",TestBean.class); System.out.println("T3 : " + t3);
		 * 
		 * Test t4=ctx.getBean("t2",TestBean.class); System.out.println("T4 : " + t4);
		 */
		
		Test t1=ctx.getBean("t1",TestBean.class);
		System.out.println("t1 : " + t1);
		
		Test t2=ctx.getBean("t1",TestBean.class);
		System.out.println("t2 : " + t2);
		
		Test t3=ctx.getBean("t1",TestBean.class);
		System.out.println("t2 : " + t3);
		
		ctx.close();
	}
}
