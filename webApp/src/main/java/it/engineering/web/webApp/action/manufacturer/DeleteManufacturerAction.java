package it.engineering.web.webApp.action.manufacturer;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.constant.WebConstant;
import it.engineering.web.webApp.domain.Proizvodjac;
import it.engineering.web.webApp.storage.MyEntityManagerFactory;

public class DeleteManufacturerAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		boolean counter = false;
		request.setAttribute("proizvodjac", ManufacturerStorage.getInstance().getProizvodjac());
		String delete = request.getParameter("Delete");
		String back = request.getParameter("Back");
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		if(delete != null)
		{
			Long idProizvodjaca = Long.parseLong(request.getParameter("idProizvodjaca"));				
			Proizvodjac proizvodjac = new Proizvodjac();
			proizvodjac.setIdProizvodjaca(idProizvodjaca);
			
			em.getTransaction().begin();
			Proizvodjac postojeciProizvodjac = em.find(Proizvodjac.class, proizvodjac.getIdProizvodjaca());
			System.out.println(postojeciProizvodjac);
			if(postojeciProizvodjac!=null)
			{
				em.remove(postojeciProizvodjac);
				em.getTransaction().commit();
				counter = true;
			
			}
			
		}
		else
			if(back != null)
			{
				return WebConstant.PAGE_MENU;
			}
		
		if(counter == true) {
			request.setAttribute("Poruka", "Upsesno obrisan proizvodjac");
			return WebConstant.PAGE_MENU;
		
		}
		else 
		return null;
	
	}

}
