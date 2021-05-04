package kr.hs.study.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.VisitListDTO;

@Component
public class MapperClass implements RowMapper<VisitListDTO>{

	public VisitListDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		VisitListDTO bean = new VisitListDTO();
		bean.setVisitorname(rs.getString("visitorname"));
		bean.setCity(rs.getString("city"));
		bean.setPhone(rs.getString("phone"));
		bean.setTemperature(rs.getString("temperature"));
		bean.setEtc(rs.getString("etc"));
		bean.setVisitdate(rs.getString("visitdate"));
		return bean;
	}
	

}
