package kr.hs.study.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.BookDTO;


@Component
public class BookDAO {
	@Autowired
	private MapperClass m1;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insert_data(BookDTO dto) {
		String sql = "insert into book values(?, ?, ?, ?)";
		jdbcTemplate.update(sql, dto.getTitle(), dto.getAuthor(), dto.getPrice(), dto.getEmail());
	}
	
	public void update_data(BookDTO dto) {
		String sql = "update book set price=? where title=?";
		jdbcTemplate.update(sql, dto.getPrice(), dto.getTitle());
	}
	
	public void delete_data(BookDTO dto) {
		String sql = "delete from book where title=?";
		jdbcTemplate.update(sql, dto.getTitle());
	}
	
	
	
	public List<BookDTO> select_data() {
		String sql = "select * from book";
		List<BookDTO> list = jdbcTemplate.query(sql, m1);
		return list;
	}
}
