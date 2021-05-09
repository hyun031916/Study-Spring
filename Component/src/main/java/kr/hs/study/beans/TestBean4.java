package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean4 {
	
	private int data1;
	private String data2;
	@Autowired
	//DataBean5 클래스의 빈(객체)가 있으면 그 주소값을 data5에 넣어라
	private DataBean4 data4;
	@Autowired
	private DataBean5 data5;

	public TestBean4(DataBean4 data4, DataBean5 data5) {
		super();
		this.data4 = data4;
		this.data5 = data5;
	}

	public int getData1() {
		return data1;
	}

	public String getData2() {
		return data2;
	}

	public DataBean4 getData4() {
		return data4;
	}

	public DataBean5 getData5() {
		return data5;
	}
	
	
	
	
	
	
}
