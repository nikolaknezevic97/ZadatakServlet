package it.engineering.web.webApp.controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.actionfactory.ActionFactory;
import it.engineering.web.webApp.login.LoginGetAction;
import it.engineering.web.webApp.login.LogoutGetAction;



public class ApplicationController {
	public String processRequest(HttpServletRequest request, HttpServletResponse response) {
		String method = request.getMethod();
		String path = request.getPathInfo();
		
		System.out.println("METHOD: " + method);
		System.out.println("PATH: " + path);
		
		AbstractAction action = failedSession(request, method, path);
		return action.executeRequest(request, response);
	}
	
	private AbstractAction failedSession(HttpServletRequest request,String method, String path) {
		
		HttpSession session = request.getSession(true);
		AbstractAction action = ActionFactory.createAction(method,path);
		
		if(session.getAttribute("loginUserSession") == null && !(method.equalsIgnoreCase("POST") && path.equalsIgnoreCase("/menu"))) {
				action = new LogoutGetAction();
		}
		return action;
	}
}

/*public class ApplicationController {
	public String processRequest(HttpServletRequest request, HttpServletResponse response) {
		AbstractAction action = requestAuthorization(request);
		return action.executeRequest(request, response);
	}


	
}*/
