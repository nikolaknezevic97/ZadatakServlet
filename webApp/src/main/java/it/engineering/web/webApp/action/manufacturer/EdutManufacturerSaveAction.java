package it.engineering.web.webApp.action.manufacturer;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.constant.WebConstant;
import it.engineering.web.webApp.domain.Proizvodjac;
import it.engineering.web.webApp.storage.MyEntityManagerFactory;

public class EdutManufacturerSaveAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("proizvodjac", ManufacturerStorage.getInstance().getProizvodjac());
		
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		String saveButton = request.getParameter("Save");
		String backButton = request.getParameter("Back");
		if(saveButton!=null)
		{
			Long idProizvodjaca = Long.parseLong(request.getParameter("idProizvodjaca"));
			String pib = request.getParameter("pib");
			String maticniBroj = request.getParameter("maticniBroj");
			String adresa = request.getParameter("adresa");
			
			Long pttBroj = Long.parseLong(request.getParameter("cityEdit"));
			
			Proizvodjac proizvodjac = new Proizvodjac();
			proizvodjac.setPib(pib);
			proizvodjac.setAdresa(adresa);
			proizvodjac.setMaticniBroj(maticniBroj);
			proizvodjac.setIdProizvodjaca(idProizvodjaca);
			
			Proizvodjac postojeciProizvodjac = em.find(Proizvodjac.class, idProizvodjaca);
			if(postojeciProizvodjac != null)
			{
				em.getTransaction().begin();
				postojeciProizvodjac.setPib(proizvodjac.getPib());
				postojeciProizvodjac.setAdresa(proizvodjac.getAdresa());
				postojeciProizvodjac.setMaticniBroj(proizvodjac.getMaticniBroj());
				
				em.persist(postojeciProizvodjac);
				em.getTransaction().commit();
				
				
			}
			request.setAttribute("Poruka", "Upesno izmenjen proizvodjac");
			return WebConstant.PAGE_VIEWMANUFACTURER;
		}
		else
			if(backButton != null)
			{
				return WebConstant.PAGE_VIEWMANUFACTURER;
			}
		return null;
	}

}
