package it.engineering.web.webApp.action.city;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.constant.WebConstant;

public class CityDelete extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("cities", CityStorage.getInstance().getCities());
		return WebConstant.PAGE_CITY_VIEW_DELETE;
	}

}
