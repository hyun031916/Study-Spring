package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.CarUser;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		CarUser c1 = ctx.getBean("obj1", CarUser.class);
		c1.prData();
		
		CarUser c2 = ctx.getBean("obj2", CarUser.class);
		c2.prData();
		
	}

}
