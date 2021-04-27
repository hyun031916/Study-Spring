package kr.hs.study.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.LoginDTO;

@Component
public class MapperClass implements RowMapper<LoginDTO>{

	public LoginDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		LoginDTO bean = new LoginDTO();
		bean.setUserid(rs.getString("userid"));
		bean.setUserpass(rs.getInt("userpass"));
		return bean;
	}
	

}
