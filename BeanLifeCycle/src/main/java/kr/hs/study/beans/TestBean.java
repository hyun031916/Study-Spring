package kr.hs.study.beans;

public class TestBean {
	
	public TestBean() {
		System.out.println("생성자");
	}
	public void testBean_init() {
		System.out.println("TestBean의 init 메서드");
	}
	public void testBean_destroy() {
		System.out.println("TestBean의 destroy 메서드");
	}
}
