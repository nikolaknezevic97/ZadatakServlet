package it.engineering.web.webApp.actionfactory;

import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.action.login.LogoutAction;
import it.engineering.web.webApp.action.manufacturer.DeleteManufacturer;
import it.engineering.web.webApp.action.manufacturer.DeleteManufacturerAction;
import it.engineering.web.webApp.action.manufacturer.NewManufacturer;
import it.engineering.web.webApp.action.manufacturer.NewManufacturerAction;
import it.engineering.web.webApp.action.manufacturer.ViewManufacturerAction;
import it.engineering.web.webApp.action.manufacturer.ViewManufacturerDetails;
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
		case WebConstant.PATH_VIEW:
			action = new ViewManufacturerDetails();
			break;
		case WebConstant.PATH_NEWMANUFACTURER:
			action = new NewManufacturer();
			break;
		case WebConstant.PATH_DELETEMANUFACTURER:
			action = new DeleteManufacturer();
			break;
		case WebConstant.PATH_CONFIRM:
			action = new NewManufacturerAction();
			break;
		case WebConstant.PATH_DELETE:
			action = new DeleteManufacturerAction();
			break;
		
		default:
			break;
		}
		
		
		return action;
	}
}
