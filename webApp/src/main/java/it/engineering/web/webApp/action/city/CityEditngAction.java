package it.engineering.web.webApp.action.city;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.constant.WebConstant;
import it.engineering.web.webApp.domain.City;

public class CityEditngAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		
		String cancel = request.getParameter("Cancel");
		String edit = request.getParameter("Edit");
		
		if(edit != null)
		{
			City city = getCity(Long.parseLong(request.getParameter("ptt_broj")), request);
			if(city != null)
			{
				request.setAttribute("city", city);
				return WebConstant.PAGE_CITY_EDITING;
				
			}
			else
			{
				request.setAttribute("cities", CityStorage.getInstance().getCities());
				return WebConstant.PAGE_CITY;
				
			}
				
			}
			if(cancel != null)
			{
				return WebConstant.PAGE_CITY;
			}
			return null;
	}
	private City getCity(long ptt_broj, HttpServletRequest request) {
		List<City> cities = (List<City>) request.getServletContext().getAttribute("cities");
		
		for (City city : cities) {
			if (city.getPtt_broj().equals(ptt_broj)) return city;
		}
		
		return null;
	}
}
