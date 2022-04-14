package it.engineering.web.webApp.action.manufacturer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.constant.WebConstant;
import it.engineering.web.webApp.domain.City;
import it.engineering.web.webApp.domain.Proizvodjac;
import it.engineering.web.webApp.storage.MyEntityManagerFactory;

public class NewManufacturerAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		
		boolean counter = false;
		
		String submit = request.getParameter("Submit");
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		if(submit != null)
		{
			Long idProizvodjaca = Long.parseLong(request.getParameter("idProizvodjaca"));
			String pib = request.getParameter("pib");
			String maticniBroj = request.getParameter("maticniBroj");
			String adresa = request.getParameter("Adresa");
			Long pttBroj = Long.parseLong(request.getParameter("pttBroj"));
			String nazivGrada = request.getParameter("nazivGrada");
			
			City city = new City();
			city.setPtt_broj(pttBroj);
			city.setNaziv(nazivGrada);
			
			Proizvodjac proizvodjac = new Proizvodjac();
			proizvodjac.setIdProizvodjaca(idProizvodjaca);
			proizvodjac.setPib(pib);
			proizvodjac.setMaticniBroj(maticniBroj);
			proizvodjac.setAdresa(adresa);
			proizvodjac.setCity(city);
			
			
			em.getTransaction().begin();
			Proizvodjac postojeciProizvodjac = em.find(Proizvodjac.class, proizvodjac.getIdProizvodjaca());
			if(postojeciProizvodjac!=null)
			{
				request.setAttribute("poruka","Proizvodjac vec postoji");
			}
			else
				
			{
				em.persist(proizvodjac);
				em.getTransaction().commit();
				counter = true;
				
			}
			
		}
		
		if(counter == true) {
			request.setAttribute("Poruka", "Upsesno dodat proizvodjac");
			return WebConstant.PAGE_MENU;
		}
		else
		return null;
		
		
		
	}

}
