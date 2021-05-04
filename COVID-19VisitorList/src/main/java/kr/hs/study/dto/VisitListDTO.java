package kr.hs.study.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class VisitListDTO {
	private String visitorname;		//방문자 이름
	private String city;			//방문자 도시
	private String phone;			//방문자 전화 번호
	private String temperature;		//방문자 체온
	private String etc;				//기타
	private String visitdate;			//방문 날짜 및 시간
	
	public String getVisitorname() {
		return visitorname;
	}
	public void setVisitorname(String visitorname) {
		this.visitorname = visitorname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	public String getVisitdate() {
		return visitdate;
	}
	public void setVisitdate(String visitdate) {
		this.visitdate = visitdate;
	}
	
	
	
}
