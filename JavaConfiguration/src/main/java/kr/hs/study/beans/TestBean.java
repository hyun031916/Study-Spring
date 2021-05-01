package kr.hs.study.beans;

public class TestBean {

	private int a;
	private double b;
	private String c;
	private DataBean1 d1;
	
	
	public TestBean() {
		System.out.println("TestBean1의 기본 생성자");
	}
		

	public TestBean(DataBean1 d1) {
		super();
		this.d1 = d1;
	}

	public TestBean(int a, double b, String c, DataBean1 d1) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d1 = d1;
	}


	public DataBean1 getD1() {
		return d1;
	}



	public void setD1(DataBean1 d1) {
		this.d1 = d1;
	}



	public TestBean(int a, double b, String c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	
	public void prData() {
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		System.out.println("c: "+ c);
	}

}
