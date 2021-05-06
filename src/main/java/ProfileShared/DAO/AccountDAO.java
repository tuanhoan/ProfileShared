package ProfileShared.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import ProfileShared.Entity.Account;
import ProfileShared.Entity.MapperAccount;

@Repository
public class AccountDAO extends BaseDAO{
	
	public List<Account> GetAll() {
		String sql = "SELECT * FROM ACCOUNT";
		return _JdbcTemplate.query(sql, new MapperAccount());
	}
}
