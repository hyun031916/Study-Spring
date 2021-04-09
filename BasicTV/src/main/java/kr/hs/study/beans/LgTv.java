package kr.hs.study.beans;

public class LgTv implements Tv{
	public LgTv() {
		System.out.println("생성자");
	}
	
	public void volumeUp() {
		System.out.println("LG TV 볼륨 키우기");
	}
	
	public void volumeDown() {
		System.out.println("LG TV 볼륨 줄이기");
	}
	
	public void powerOn() {
		System.out.println("LG TV 전원 키기");
	}
	
	public void powerOff() {
		System.out.println("LG TV 전원 끄기");
	}
	
}
