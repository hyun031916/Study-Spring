package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.CarUser;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		CarUser cu1 = ctx.getBean(CarUser.class);
		cu1.setOwner("수혀니");
		cu1.setColor("뻐쁠");
		System.out.println("차주: "+cu1.getOwner());
		System.out.println("차색: "+cu1.getColor());
		cu1.getCar_type().setPrice(10000);
		cu1.getCar_type().setName("아우디");
		System.out.println("가격: "+cu1.getCar_type().getPrice());
		System.out.println("차종: "+cu1.getCar_type().getName());
		
		ctx.close();
		
		System.out.println("====================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		CarUser cu2 = ctx2.getBean(CarUser.class);
		cu2.setOwner("수혀니");
		cu2.setColor("뻐쁠");
		System.out.println("차주: "+cu2.getOwner());
		System.out.println("차색: "+cu2.getColor());
		cu2.getCar_type().setPrice(10000);
		cu2.getCar_type().setName("아우디");
		System.out.println("가격: "+cu2.getCar_type().getPrice());
		System.out.println("차종: "+cu2.getCar_type().getName());
		ctx2.close();
	}

}
