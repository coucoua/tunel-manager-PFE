package services.managmentServices.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.managmentServices.interfaces.TunelServicesLocal;
import services.managmentServices.interfaces.TunelServicesRemote;

import domain.Tunel;

/**
 * Session Bean implementation class TunelServices
 */
@Stateless
public abstract class TunelServices implements TunelServicesRemote, TunelServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public TunelServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Tunel> findAllTunels() {

		return entityManager.createQuery("select t from Tunel t", Tunel.class)
				.getResultList();
	}

	//@Override
	// public Boolean addTunnel(Tunel tunnel) {
		//Boolean b = false;
		//try {
			//entityManager.persist(tunnel);
			//b = true;
		//} catch (Exception e) {
		//}
		//return b;
	//}

}
