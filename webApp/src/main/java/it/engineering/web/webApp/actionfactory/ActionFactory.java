package it.engineering.web.webApp.actionfactory;

import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.action.city.CityAction;
import it.engineering.web.webApp.action.city.CityDelete;
import it.engineering.web.webApp.action.city.CityDeleteAction;
import it.engineering.web.webApp.action.city.CityDetailsAction;
import it.engineering.web.webApp.action.city.CityEditingSaveAction;
import it.engineering.web.webApp.action.city.CityEditngAction;
import it.engineering.web.webApp.action.city.CityInsert;
import it.engineering.web.webApp.action.city.CityInsertAction;
import it.engineering.web.webApp.action.login.LogoutAction;
import it.engineering.web.webApp.action.login.LogoutUserAction;
import it.engineering.web.webApp.action.manufacturer.DeleteManufacturer;
import it.engineering.web.webApp.action.manufacturer.DeleteManufacturerAction;
import it.engineering.web.webApp.action.manufacturer.EditMAnufacturerAction;
import it.engineering.web.webApp.action.manufacturer.EdutManufacturerSaveAction;
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
		case WebConstant.PATH_CITY:
			action = new CityAction();
			break;
		case WebConstant.PATH_CITY_DETAILS:
			action = new CityDetailsAction();
			break;
		case WebConstant.PATH_EDIT:
			action = new EditMAnufacturerAction();
			break;
		case WebConstant.PATH_SAVE:
			action = new EdutManufacturerSaveAction();
			break;
		case WebConstant.PATH_LOGOUT_USER:
			action = new LogoutUserAction();
			break;
		case WebConstant.PATH_CITY_EDITING:
			action = new CityEditngAction();
			break;
		case WebConstant.PATH_CITY_EDITING_SAVE:
			action = new CityEditingSaveAction();
			break;
			
		case WebConstant.PATH_CITY_VIEW_INSERT:
			action = new CityInsert();
			break;
		case WebConstant.PATH_CITY_INSERT:
			action = new CityInsertAction();
			break;
		case WebConstant.PATH_CITY_VIEW_DELETE:
			action = new CityDelete();
			break;
		case WebConstant.PATH_CITY_DELETE:
			action = new CityDeleteAction();
			break;
		
		
		default:
			break;
		}
		
		
		return action;
	}
}
