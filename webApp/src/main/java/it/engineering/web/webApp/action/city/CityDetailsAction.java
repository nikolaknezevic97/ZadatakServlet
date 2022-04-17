package it.engineering.web.webApp.action.city;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.constant.WebConstant;
import it.engineering.web.webApp.domain.City;

public class CityDetailsAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		
		City city = getCity(Long.parseLong(request.getParameter("ptt_broj")), request);
		if(city != null)
		{
			Long ptt_broj = Long.parseLong(request.getParameter("ptt_broj"));
			String naziv = request.getParameter("name");
			request.setAttribute("city", city);
			return WebConstant.PAGE_CITY_DETAILS;
			
		}
		else
		{
			request.setAttribute("cities", CityStorage.getInstance().getCities());
			return WebConstant.PAGE_CITY;
			
		}
	}

	private City getCity(long ptt_broj, HttpServletRequest request) {
		List<City> cities = (List<City>) request.getServletContext().getAttribute("cities");
		
		for (City city : cities) {
			if (city.getPtt_broj().equals(ptt_broj)) return city;
		}
		
		return null;
	}

	

}
