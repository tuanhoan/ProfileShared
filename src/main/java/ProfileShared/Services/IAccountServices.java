package ProfileShared.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProfileShared.Entity.Account;

@Service
public interface IAccountServices {
	@Autowired
	public List<Account> GetAll();
}
