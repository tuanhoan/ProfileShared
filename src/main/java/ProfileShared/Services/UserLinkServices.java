package ProfileShared.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProfileShared.DAO.UserLinkDAO;
import ProfileShared.Entity.UserLink;

@Service
public class UserLinkServices {
	@Autowired
	UserLinkDAO _userLinkDAO;
	public List<UserLink> GetAll(){
		return _userLinkDAO.GetAll();
	}
}
