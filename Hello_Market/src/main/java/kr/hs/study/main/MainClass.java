package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.LGTv;
import kr.hs.study.beans.SamsungTv;
import kr.hs.study.config.Tvjava;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/Tvxml.xml");
		SamsungTv s1 = ctx.getBean("s1", SamsungTv.class);
		System.out.println("가격: "+s1.getPrice());
		System.out.println("스피커: "+s1.getSpeaker());
		s1.powerOn();
		s1.powerDown();
		s1.getSpeaker().volumeUp();
		s1.getSpeaker().volumeDown();
		
		LGTv l1 = ctx.getBean("s2", LGTv.class);
		System.out.println("가격: "+l1.getPrice());
		System.out.println("스피커: "+l1.getSpeaker());
		l1.powerOn();
		l1.powerDown();
		l1.getSpeaker().volumeUp();
		l1.getSpeaker().volumeDown();
		ctx.close();
		

		
		System.out.println("====================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(Tvjava.class);
		
		SamsungTv s2 = ctx2.getBean("s2", SamsungTv.class);
		System.out.println("가격: "+s2.getPrice());
		System.out.println("스피커: "+s2.getSpeaker());
		s2.powerOn();
		s2.powerDown();
		s2.getSpeaker().volumeUp();
		s2.getSpeaker().volumeDown();
		
		LGTv l2 = ctx2.getBean("l2", LGTv.class);
		System.out.println("가격: "+l2.getPrice());
		System.out.println("스피커: "+l2.getSpeaker());
		l2.powerOn();
		l2.powerDown();
		l2.getSpeaker().volumeUp();
		l2.getSpeaker().volumeDown();
		ctx2.close();
	}

}
