package kr.hs.study.DAO;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.LoginDTO;

@Component
public class LoginDAO {
	@Autowired
	private MapperClass m1;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insert_data(LoginDTO dto) {
		String sql = "insert into login values(?, ?)";
		jdbcTemplate.update(sql, dto.getUserid(), dto.getUserpass());
	}
	
	public void update_data(LoginDTO dto) {
		String sql = "update login set userpass=? where userid=?";
		jdbcTemplate.update(sql, dto.getUserpass(), dto.getUserid());
	}
	
	public void delete_data(LoginDTO dto) {
		String sql = "delete from login where userid=?";
		jdbcTemplate.update(sql, dto.getUserid());
	}
	
	public List<LoginDTO> select_data() {
		String sql = "select * from login";
		List<LoginDTO> list = jdbcTemplate.query(sql, m1);
		return list;
	}
}
