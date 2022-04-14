package it.engineering.web.webApp.storage;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyEntityManagerFactory {
	private static MyEntityManagerFactory instance;
	private  EntityManagerFactory emf;
	
	
	private MyEntityManagerFactory() {
		emf = Persistence.createEntityManagerFactory("webApp");
	}
	public static EntityManagerFactory getEntityManagerFactory() {
		if(instance==null) {
			instance=new MyEntityManagerFactory();
		}
		return instance.getEMF();
	}
	
	private EntityManagerFactory getEMF() {
		return emf;
	}
	
	public static void closeEMF() {
		if(instance!=null) {
			instance.getEMF().close();
		}
	}
}
