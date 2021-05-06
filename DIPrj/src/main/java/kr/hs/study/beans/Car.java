package kr.hs.study.beans;

public class Car {
	
	private int price;
	private String name;
	
	
	public Car() {
		System.out.println("기본 생성자");
	}
	public Car(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	

}
