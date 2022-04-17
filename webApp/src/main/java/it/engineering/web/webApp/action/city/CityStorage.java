package it.engineering.web.webApp.action.city;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import it.engineering.web.webApp.domain.City;



public class CityStorage {
	private List<City> cities;
	private static CityStorage instance;
	
	public CityStorage(HttpServletRequest request) {
		cities = (List<City>) request.getServletContext().getAttribute("cities");
	}
	
	public CityStorage() {
		
	}
	
	public static CityStorage getInstance() {
		if (instance == null) instance = new CityStorage();
		return instance;
	}
	
	public void add(City city) {
		cities.add(city);
	}
		
	public List<City> getCities() {
		return cities;
	}
}
