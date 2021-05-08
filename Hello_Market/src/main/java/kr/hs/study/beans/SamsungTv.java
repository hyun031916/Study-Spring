package kr.hs.study.beans;

public class SamsungTv implements TV{
	int price;
	SonySpeaker speaker;
	
	public void powerOn() {
		System.out.println("전원을 킵니다.");
	}
	
	public void powerDown() {
		System.out.println("전원을 끕니다.");
	}

	
	public SamsungTv() {
		super();
	}

	public SamsungTv(int price, SonySpeaker speaker) {
		super();
		this.price = price;
		this.speaker = speaker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public SonySpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}
	
	
}
