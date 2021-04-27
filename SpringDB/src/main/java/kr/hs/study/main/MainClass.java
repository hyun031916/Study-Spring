package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.DAO.LoginDAO;
import kr.hs.study.config.JavaConfig;
import kr.hs.study.dto.LoginDTO;


public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
//		java로 설정
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
	
		LoginDAO loginDAO = ctx.getBean("loginDAO", LoginDAO.class);
		LoginDTO bean1 = ctx.getBean("loginDTO", LoginDTO.class);
		bean1.setUserid("kim");
		bean1.setUserpass(1111);

		//삽입하기
//		LoginDTO bean2 = ctx.getBean("loginDTO", LoginDTO.class);
//		bean2.setUserid("lee");
//		bean2.setUserpass(2222);
		//loginDAO.insert_data(bean2);

		//수정하기
//		bean1.setUserpass(2222);
//		bean1.setUserid("kim");
//		loginDAO.update_data(bean1);
//		System.out.println("수정완료");
//		
//		loginDAO.delete_data(bean2);
		
		List<LoginDTO> list = loginDAO.select_data();
		for(LoginDTO dto:list) {
			System.out.println(dto.getUserid());
			System.out.println(dto.getUserpass());
		}
		
		
		System.out.println("=================================");

		ctx.close();
	}
}
