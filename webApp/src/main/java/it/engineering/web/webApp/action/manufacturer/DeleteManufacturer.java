package it.engineering.web.webApp.action.manufacturer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.webApp.action.AbstractAction;
import it.engineering.web.webApp.constant.WebConstant;

public class DeleteManufacturer extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		request.setAttribute("proizvodjac", ManufacturerStorage.getInstance().getProizvodjac());
		return WebConstant.PAGE_DELETEMANUFACTURER;
	}

}
