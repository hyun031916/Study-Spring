package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.LgTv;
import kr.hs.study.beans.Tv;
import kr.hs.study.beans.samsungTv;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Tv t1 = ctx.getBean("t1", LgTv.class);
		t1.powerOff();
		Tv t2 = ctx.getBean("t2", samsungTv.class);
		t2.powerOff();
		ctx.close();
	}

}
