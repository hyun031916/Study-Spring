package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
@Component("obj3")
@Lazy
public class TestBean3 {
	public TestBean3() {
		System.out.println("TestBean3의 기본 생성자");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init 호출");
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("destroy 호출");
	}
}