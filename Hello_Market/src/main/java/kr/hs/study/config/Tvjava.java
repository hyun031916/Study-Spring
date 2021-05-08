package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.AppleSpeaker;
import kr.hs.study.beans.LGTv;
import kr.hs.study.beans.SamsungTv;
import kr.hs.study.beans.SonySpeaker;

@Configuration
public class Tvjava {
	
	@Bean
	public SamsungTv s2() {
		return new SamsungTv(500, speaker1());
	}
	
	@Bean
	public SonySpeaker speaker1() {
		return new SonySpeaker();
	}
	
	@Bean
	public AppleSpeaker speaker2() {
		return new AppleSpeaker();
	}
	
	@Bean 
	public LGTv l2() {
		LGTv l1 = new LGTv();
		l1.setPrice(500);
		l1.setSpeaker(speaker2());
		return l1;
	}
	
	
}
