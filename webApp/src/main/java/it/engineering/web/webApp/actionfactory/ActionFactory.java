package it.engineering.web.webApp.actionfactory;

import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.action.login.LogoutAction;
import it.engineering.web.webApp.action.manufacturer.ViewManufacturerAction;
import it.engineering.web.webApp.constant.WebConstant;
import it.engineering.web.webApp.login.LoginGetAction;
import it.engineering.web.webApp.login.LoginPostAction;

public class ActionFactory {

	public static AbstractAction createAction(String method, String path) {
		AbstractAction action = null;
		
		switch (path) {
		case WebConstant.PATH_MENU:
			if (method.equalsIgnoreCase("GET")) action = new LoginGetAction();
			if (method.equalsIgnoreCase("POST")) action = new LoginPostAction();
			break;
		case WebConstant.PATH_LOGOUT:
			action = new LogoutAction();
			break;
		case WebConstant.PATH_VIEWMANUFACTURER:
			action = new ViewManufacturerAction();
			break;
		
		default:
			break;
		}
		
		
		return action;
	}
}
