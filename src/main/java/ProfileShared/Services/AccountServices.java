package ProfileShared.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProfileShared.DAO.AccountDAO;
import ProfileShared.Entity.Account;

@Service
public class AccountServices implements IAccountServices{
	@Autowired
	private AccountDAO contextAccountDAO;
	public List<Account> GetAll(){
		return contextAccountDAO.GetAll();
	}
}
