package it.engineering.web.webApp.action.city;

import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.constant.WebConstant;
import it.engineering.web.webApp.domain.City;
import it.engineering.web.webApp.storage.MyEntityManagerFactory;


public class CityInsertAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		
		String insert = request.getParameter("Insert");
		String cancel = request.getParameter("Cancel");
		boolean counter = false;
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		if(insert != null)
		{
			Long pttBroj = Long.parseLong(request.getParameter("ptt_broj"));
			String naziv = request.getParameter("name");
			
			City city = new City(pttBroj,naziv);
			City existsCity = em.find(City.class, pttBroj);
			if(existsCity != null)
			{
				request.setAttribute("poruka","Grad vec postoji");
				return WebConstant.PAGE_CITY_VIEW_INSERT;
				
			}
			else
			if(existsCity == null)
			{
				em.getTransaction().begin();
				em.persist(city);
				em.getTransaction().commit();
				counter = true;
				
			}
		}
		if(cancel != null)
		{
			return WebConstant.PAGE_MENU;
		}
		System.out.println(counter);
		if(counter == true)
		{
			request.setAttribute("Poruka", "Uspesno dodat grad");
			return WebConstant.PAGE_MENU;
		}
		else
			return null;
		
		}
	
}


		
