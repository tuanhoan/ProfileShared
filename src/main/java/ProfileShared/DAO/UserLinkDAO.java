package ProfileShared.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import ProfileShared.Entity.MapperUserLink;
import ProfileShared.Entity.UserLink;

@Repository
public class UserLinkDAO extends BaseDAO {
	public List<UserLink> GetAll(){
		String sql = "SELECT * FROM USERLINK";
		return _JdbcTemplate.query(sql, new MapperUserLink());
	}
}
