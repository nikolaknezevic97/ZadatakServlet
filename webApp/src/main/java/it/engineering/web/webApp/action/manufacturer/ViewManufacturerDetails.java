package it.engineering.web.webApp.action.manufacturer;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.constant.WebConstant;
import it.engineering.web.webApp.domain.Proizvodjac;

public class ViewManufacturerDetails extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		
		Proizvodjac proizvodjac = getProizvodjac(Long.parseLong(request.getParameter("idProizvodjaca")), request);
		
		if (proizvodjac!=null) {
			request.setAttribute("proizvodjac", proizvodjac);
			return WebConstant.PAGE_VIEW;
		}
		else {
			request.setAttribute("proizvodjaci", ManufacturerStorage.getInstance().getProizvodjac());
			return WebConstant.PAGE_VIEWMANUFACTURER;
		}
		
	}

	private Proizvodjac getProizvodjac(long idProizvodjaca, HttpServletRequest request) {
		
		List<Proizvodjac> proizvodjaci =(List<Proizvodjac>) request.getServletContext().getAttribute("proizvodjaci");		
		for (Proizvodjac proizvodjac : proizvodjaci) {
			System.out.println(proizvodjac);
			if(proizvodjac.getIdProizvodjaca().equals(idProizvodjaca))
				return proizvodjac;
		}
		
		return null;
	}

}
