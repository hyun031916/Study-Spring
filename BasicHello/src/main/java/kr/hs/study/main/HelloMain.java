package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;
import kr.hs.study.beans.helloInter;

public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		helloInter en=ctx.getBean("hello1",HelloWorldEn.class);
		en.sayHello();
		
		helloInter ko=ctx.getBean("hello2",HelloWorldKo.class);
		ko.sayHello();
		
		ctx.close();
	}

}
