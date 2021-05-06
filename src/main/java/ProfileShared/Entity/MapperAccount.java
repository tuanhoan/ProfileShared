package ProfileShared.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
 

public class MapperAccount implements RowMapper<Account> {
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException{
		Account account = new Account();
		account.setId(rs.getInt("id"));
		account.setUsername(rs.getString("username"));
		account.setPassword(rs.getString("password"));
		account.setDisplayName(rs.getString("display_name"));
		account.setGmail(rs.getString("gmail"));
		account.setPhone(rs.getString("phone"));
		return account;
	}
}
