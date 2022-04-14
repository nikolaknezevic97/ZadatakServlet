package it.engineering.web.webApp.Listener;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import it.engineering.web.webApp.domain.User;
import it.engineering.web.webApp.storage.MyEntityManagerFactory;

/**
 * Application Lifecycle Listener implementation class ContextListener
 *
 */
public class ContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	ServletContext sc = sce.getServletContext();
    	
    	@SuppressWarnings("serial")
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
    	List<User> users = em.createQuery("select u from User u", User.class).getResultList();
		
//		new ArrayList<User>() {
//    		{
//    			add(new User("admin","admin", "petar", "peric"));
//    			add(new User("user","pass", "nikola", "nikolic"));
//    			add(new User("test","test", "ana", "anic"));
//    		}
//    	};
//    	
    	sc.setAttribute("users", users);
    	sce.getServletContext().setAttribute("login_users", new ArrayList<User>());
    }
    
	
}
