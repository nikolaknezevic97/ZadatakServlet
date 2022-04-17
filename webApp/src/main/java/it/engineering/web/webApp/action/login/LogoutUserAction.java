package it.engineering.web.webApp.action.login;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.constant.WebConstant;
import it.engineering.web.webApp.domain.User;

public class LogoutUserAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession(false);
		User logoutUser = (User) session.getAttribute("loginUser");
		List<User> logout_user = (List<User>) request.getServletContext().getAttribute("login_users");
		logout_user.remove(logoutUser);
		session.setAttribute("login_users", logout_user);
		session.invalidate();
		return WebConstant.PAGE_INDEX;
		
		
	}
}
