package it.engineering.web.webApp.storage;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import it.engineering.web.webApp.domain.User;


public class UserStorage {
	private List<User> users;
	private static UserStorage instance;
	
	public UserStorage() {
		/*users = new ArrayList() {
			{
				add(new User("user 1", "user 1", "user1", "user1"));
				add(new User("user 2", "user 2", "user2", "user2"));
				add(new User("user 3", "user 3", "user3", "user3"));
			}
		};*/
	}
	
	public static UserStorage getInstance() {
		if (instance == null) instance = new UserStorage();
		return instance;
	}
	
	public void add(User user) {
		users.add(user);
	}
		
	public List<User> getUsers() {
		return users;
	}
	
	public List<User> getAll(){
		EntityManager em = MyEntityManagerFactory
				.getEntityManagerFactory()
				.createEntityManager();
		//JPQL
		List<User> users = em
				.createQuery("select u from User u",User.class)
				.getResultList();
		
		users = em.createNamedQuery("User.findAll", User.class)
				.getResultList();
		
		//SQL upit, native query
		users = em.createNativeQuery("select * from User",User.class)
				.getResultList();
		em.close();
		return users;
	}
	
}
