package it.engineering.web.webApp.login;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.constant.WebConstant;
import it.engineering.web.webApp.domain.User;
import it.engineering.web.webApp.storage.UserStorage;



public class LoginPostAction  extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		
		
		User user = login(request);		
		List<User> loginUsers = (List<User>) request.getServletContext().getAttribute("login_users");
		boolean indicator = false;
		if (user!=null) {			
						
			if(!loginUsers.contains(user))
			{
				indicator = true;
				loginUsers.add(user);
				
			}

			HttpSession session = request.getSession(true);
			User loginUserSession  = user.clone();
			session.setAttribute("loginUserSession", loginUserSession);
				
			if(indicator) {	
				
				return WebConstant.PAGE_MENU;
				
			}
			else
			{
				return WebConstant.PAGE_ERROR;
			}
			
		}else{
			
			request.setAttribute("error_message", "Korisnik ne postoji!");
			return WebConstant.PAGE_INDEX;
		}
		
		
	}

	private User login(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		List<User> users = (List<User>) request.getServletContext().getAttribute("users");
		for (User current : users) {
			
			if (current.equals(user)) return current;
		}
		System.out.println(users);
		return null;
	}

}
