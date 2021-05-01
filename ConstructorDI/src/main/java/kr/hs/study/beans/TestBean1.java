package kr.hs.study.beans;

public class TestBean1 {
	private int data1;
	private double data2;
	private String data3;
	
	public TestBean1() {
		System.out.println("TestBean1의 기본 생성자");
		this.data1 = 0;
		this.data2  = 0.0;
		this.data3 = "string1";
	}
	
	public TestBean1(int data1) {
		System.out.println("TestBean1의 int0 생성자");
		this.data1 = data1;
		this.data2  = 11.11;
		this.data3 = "string2";
	}
	
	public TestBean1(double data2) {
		System.out.println("TestBean1의 double 생성자");
		this.data1 = 10;
		this.data2 = data2;
		this.data3 = "string3";
	}
	
	//string 1개 생성자 만들고 30 ,33.33  " string4"
	public TestBean1(String data3) {
		System.out.println("TestBean1의 String 생성자");
		this.data1 = 30;
		this.data2 = 33.33;
		this.data3 = data3;
	}
	
	public TestBean1(int data1, double data2, String data3) {
		System.out.println("TestBean1의 생성자");
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}
	public void prData() {
		System.out.println("data1: "+data1);
		System.out.println("data2: "+data2);
		System.out.println("data3: "+data3);
	}
}
