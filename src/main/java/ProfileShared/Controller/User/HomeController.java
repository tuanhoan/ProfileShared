package ProfileShared.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ProfileShared.Services.AccountServices;

@Controller
public class HomeController {
	@Autowired
	AccountServices _accountServices;
	@RequestMapping(value = { "/", "/trang-chu" })
	public ModelAndView Index() {  
		ModelAndView mView = new ModelAndView("index"); 
		mView.addObject("account", _accountServices.GetAll());
		return mView;
	}
}
