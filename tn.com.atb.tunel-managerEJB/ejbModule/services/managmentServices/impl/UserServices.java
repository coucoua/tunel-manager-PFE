package services.managmentServices.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import services.managmentServices.interfaces.UserServicesLocal;
import services.managmentServices.interfaces.UserServicesRemote;
import domain.User;

/**
 * Session Bean implementation class UserServices
 */
@Stateless
public class UserServices implements UserServicesRemote, UserServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UserServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addUser(User user) {
		Boolean b = false;
		try {
			entityManager.persist(user);
			b = true;
		} catch (Exception e) {
			System.err.println("problem");
		}
		return b;
	}

	@Override
	public User login(String login, String password) {
		User user = null;
		try {
			String jpql = "select u from User u where u.login=:login and u.password=:password";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("login", login);
			query.setParameter("password", password);
			user = (User) query.getSingleResult();
		} catch (Exception e) {
		}
		return user;
	}

	@Override
	public List<User> findAllUsers() {
		return entityManager.createQuery("select u from User u", User.class)
				.getResultList();
	}

	@Override
	public Boolean updateUser(User user) {
		Boolean b = false;
		try {
			entityManager.merge(user);
			b = true;
		} catch (Exception e) {
			System.err.println("problem");
		}
		return b;
	}

}
