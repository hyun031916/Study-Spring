package kr.hs.study.beans;

public class LGTv implements TV{
	int price;
	AppleSpeaker speaker;
	
	
	public LGTv() {
		super();
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public AppleSpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
	}

	public LGTv(int price, AppleSpeaker speaker) {
		super();
		this.price = price;
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("전원을 킵니다.");
	}
	
	public void powerDown() {
		System.out.println("전원을 끕니다.");
	}
}
