package ProfileShared.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperUserLink implements RowMapper<UserLink> {
	public UserLink mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserLink userLink = new UserLink();
		userLink.setSocialNetworkId(rs.getInt("SocialNetworkId"));
		userLink.setAccountId(rs.getInt("AccountId"));
		userLink.setLink(rs.getString("Link")); 
		return userLink;
	}
}
