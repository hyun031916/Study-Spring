package kr.hs.study.dto;
//사용자가 입력한 정보를 저장하거나, database에 있는 정보를 저장시킴
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LoginDTO {
	private String userid;
	private int userpass;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getUserpass() {
		return userpass;
	}
	public void setUserpass(int userpass) {
		this.userpass = userpass;
	}
	
	
	
	
}
