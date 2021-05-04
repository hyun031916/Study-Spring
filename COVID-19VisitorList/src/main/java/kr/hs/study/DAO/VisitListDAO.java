package kr.hs.study.DAO;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.VisitListDTO;

@Component
public class VisitListDAO {
	
	@Autowired
	public MapperClass m1;
	
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	//방문자 데이터 삽입
	public void insert_data(VisitListDTO dto) {
		String sql = "INSERT INTO COVID19VisitorList values(?, ?, ?, ?, ?, ?)";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strDate = sdf.format(Calendar.getInstance().getTime());
		jdbcTemplate.update(sql, dto.getVisitorname(), dto.getCity(), dto.getPhone(), dto.getTemperature(), dto.getEtc(), strDate);
	}

	//방문자 데이터 수정
	public void update_data(VisitListDTO dto) {
		String sql = "update COVID19VisitorList set visitorname=? where phone=?";
		jdbcTemplate.update(sql, dto.getVisitorname(), dto.getPhone());
	}
	
	//방문자 데이터 삭제
	public void delete_data(VisitListDTO dto) {
		String sql = "delete from COVID19VisitorList where phone=?";
		jdbcTemplate.update(sql, dto.getPhone());
	}
	
	//방문자 데이터 가져오기
	public List<VisitListDTO> select_data() {
		String sql = "select * from COVID19VisitorList";
		List<VisitListDTO> list = jdbcTemplate.query(sql, m1);
		return list;
	}

}
