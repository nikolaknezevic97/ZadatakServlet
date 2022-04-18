package it.engineering.web.webApp.action.city;

import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.constant.WebConstant;
import it.engineering.web.webApp.domain.City;
import it.engineering.web.webApp.storage.MyEntityManagerFactory;

public class CityEditingSaveAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		
		String save = request.getParameter("Save");
		String cancel = request.getParameter("Back");
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		if(save != null)
		{
			Long pttBroj = Long.parseLong(request.getParameter("ptt_broj"));
			String naziv = request.getParameter("name");
		
			City city = new City();
			city.setPtt_broj(pttBroj);
			city.setNaziv(naziv);
			
			City existsCity = em.find(City.class, pttBroj);
						
			if(existsCity != null)
			{
				em.getTransaction().begin();				
				existsCity.setNaziv(city.getNaziv());
				em.persist(existsCity);
				em.getTransaction().commit();
				
			}
			else
			{
				request.setAttribute("Poruka", "Grad sa unetim ptt brojem ne postoji");
				return WebConstant.PAGE_CITY_EDITING;
			}
			
			request.setAttribute("Poruka", "Uspesno odradjena izmena grada");
			return WebConstant.PAGE_MENU;
		}
		
		if(cancel != null)
		{
			return WebConstant.PAGE_CITY_DETAILS;
		}
		return null;
	}
	
	

}
