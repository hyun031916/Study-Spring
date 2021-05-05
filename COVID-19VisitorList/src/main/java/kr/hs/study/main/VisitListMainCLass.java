package kr.hs.study.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.DAO.VisitListDAO;
import kr.hs.study.config.JavaConfig;
import kr.hs.study.dto.VisitListDTO;

public class VisitListMainCLass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		java로 설정
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
	
		Scanner scan = new Scanner(System.in);
		VisitListDAO dao = ctx.getBean("visitListDAO", VisitListDAO.class);
		VisitListDTO bean1 = ctx.getBean("visitListDTO", VisitListDTO.class);
		
		//삽입하기
		bean1.setVisitorname("김두현");
		bean1.setCity("중랑");
		bean1.setPhone("010-1111-2222");
		bean1.setTemperature("36.5");
		bean1.setEtc("외 2명");
//		dao.insert_data(bean1);
//		System.out.println("삽입 완료");
		
		VisitListDTO bean2 = ctx.getBean("visitListDTO", VisitListDTO.class);

		bean2.setVisitorname("강은별");
		bean2.setCity("안산");
		bean2.setPhone("010-2222-2222");
		bean2.setTemperature("35.5");
		bean2.setEtc("외 1명");
//		dao.insert_data(bean2);
//		System.out.println("삽입 완료");

		VisitListDTO bean3 = ctx.getBean("visitListDTO", VisitListDTO.class);

		bean3.setVisitorname("류현서");
		bean3.setCity("노원");
		bean3.setPhone("010-3333-2222");
		bean3.setTemperature("36.4");
		bean3.setEtc("외 3명");
//		dao.insert_data(bean3);
		System.out.println("삽입 완료");
		
		VisitListDTO bean4 = ctx.getBean("visitListDTO", VisitListDTO.class);

		System.out.println("=======================코로나19 출입 명부 작성 프로그램=======================");
		System.out.print("이름을 입력하세요: ");
		bean4.setVisitorname(scan.next());
		System.out.print("도시를 입력하세요: ");
		bean4.setCity(scan.next());
		System.out.print("전화번호를 입력하세요: ");
		bean4.setPhone(scan.next());
		System.out.print("온도를 입력하세요: ");
		bean4.setTemperature(scan.next());
		System.out.print("기타 사항을 입력하세요: ");
		bean4.setEtc(scan.next());
		dao.insert_data(bean4);
		System.out.println("출입 명부 작성이 성공적으로 완료되었습니다.");
		
		//수정하기
		bean1.setVisitorname("김수현");
		bean1.setPhone("010-1111-2222");
		dao.update_data(bean1);
		System.out.println("수정 완료");
		
		//삭제하기
//		dao.delete_data(bean3);
		System.out.println("삭제 완료");
		
		List<VisitListDTO> list = dao.select_data();
		for(VisitListDTO dto:list) {
			System.out.println(dto.getVisitorname());
			System.out.println(dto.getCity());
			System.out.println(dto.getPhone());
			System.out.println(dto.getTemperature());
			System.out.println(dto.getEtc());
			System.out.println(dto.getVisitdate());
		}
		
		System.out.println("=================================");

		ctx.close();
	}

}
