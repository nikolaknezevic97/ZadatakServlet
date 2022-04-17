package it.engineering.web.webApp.action.manufacturer;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.constant.WebConstant;
import it.engineering.web.webApp.domain.Proizvodjac;

public class EditMAnufacturerAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("proizvodjac", ManufacturerStorage.getInstance().getProizvodjac());
		Proizvodjac proizvodjac = getProizvodjac(Long.parseLong(request.getParameter("idProizvodjaca")), request);
		String edit = request.getParameter("Edit");
		if(edit != null && proizvodjac!=null)
		{
			Long idProizvodjaca = Long.parseLong(request.getParameter("idProizvodjaca"));
			String pib = request.getParameter("pib");
			String maticniBroj = request.getParameter("maticniBroj");
			String adresa = request.getParameter("adresa");
			String pttBoj = request.getParameter("ptt_broj");
			
			request.setAttribute("proizvodjac", proizvodjac);
			
			return WebConstant.PAGE_EDIT;
		}
		else
		{
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
