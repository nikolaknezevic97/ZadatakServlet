package it.engineering.web.webApp.action.city;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.constant.WebConstant;
import it.engineering.web.webApp.domain.City;
import it.engineering.web.webApp.storage.MyEntityManagerFactory;

public class CityDeleteAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		String delete = request.getParameter("Delete");
		String cancel = request.getParameter("Cancel");
		boolean counter = false;
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		if(delete != null)
		{
			Long pttBroj = Long.parseLong(request.getParameter("ptt_broj"));
			
			City existsCity = em.find(City.class, pttBroj);
			if(existsCity != null)
			{
				em.getTransaction().begin();
				em.remove(existsCity);
				em.getTransaction().commit();
				counter = true;	
				
			}
			else
			if(existsCity == null)
			{
				request.setAttribute("poruka","Grad ne postoji!");
				return WebConstant.PAGE_CITY_VIEW_DELETE;				
			}
		}
		if(cancel != null)
		{
			return WebConstant.PAGE_MENU;
		}
		System.out.println(counter);
		if(counter == true)
		{
			request.setAttribute("Poruka", "Uspesno obrisan grad");
			return WebConstant.PAGE_MENU;
		}
		else
			return null;
		
		}
	

}
