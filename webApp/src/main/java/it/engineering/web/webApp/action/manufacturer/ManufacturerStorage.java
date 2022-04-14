package it.engineering.web.webApp.action.manufacturer;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import it.engineering.web.webApp.domain.Proizvodjac;

public class ManufacturerStorage {

	private List<Proizvodjac> proizvodjaci;
	private static ManufacturerStorage instance;
	
	public ManufacturerStorage(HttpServletRequest request) {
		proizvodjaci = (List<Proizvodjac>) request.getServletContext().getAttribute("proizvodjaci");
	}
	
	public ManufacturerStorage() {
		
	}
	
	public static ManufacturerStorage getInstance() {
		if (instance == null) instance = new ManufacturerStorage();
		return instance;
	}
	
	public void add(Proizvodjac proizvodjac) {
		proizvodjaci.add(proizvodjac);
	}
		
	public List<Proizvodjac> getProizvodjac() {
		return proizvodjaci;
	}
}
