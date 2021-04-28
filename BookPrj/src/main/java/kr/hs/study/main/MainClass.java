package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.DAO.BookDAO;
import kr.hs.study.config.JavaConfig;
import kr.hs.study.dto.BookDTO;


public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
//		java로 설정
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		BookDAO dao = ctx.getBean("bookDAO", BookDAO.class);
		BookDTO bean1 = ctx.getBean("bookDTO", BookDTO.class);
		
		bean1.setTitle("해리포터");
		bean1.setAuthor("조앤롤링");
		bean1.setPrice(50000);
		bean1.setEmail("hyun031916@gmail.com");
		
		//dao.insert_data(bean1);
		
		BookDTO bean2 = ctx.getBean("bookDTO", BookDTO.class);
		
		bean2.setTitle("호밀밭의 파수꾼");
		bean2.setAuthor("제롬 데이비드 샐린저");
		bean2.setPrice(25000);
		bean2.setEmail("1111@gmail.com");
		
		//dao.insert_data(bean2);
		System.out.println("데이터 삽입");
		
		bean2.setPrice(20000);
		dao.update_data(bean2);
		System.out.println("데이터 수정");
		
		dao.delete_data(bean2);
		System.out.println("데이터 삭제");
		
		List<BookDTO> list = dao.select_data();
		for(BookDTO dto:list) {
			System.out.println(dto.getTitle());
			System.out.println(dto.getAuthor());
			System.out.println(dto.getPrice());
			System.out.println(dto.getEmail());
		}
		System.out.println("데이터 출력");
		
		
		System.out.println("=================================");

		ctx.close();
	}
}
