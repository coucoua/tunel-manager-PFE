package domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Tunel
 * 
 */
@Entity
public class Tunel implements Serializable {

	private Integer id;

	private Boolean state;
	
	private static final long serialVersionUID = 1L;

	private Router router;
	private Agency agency;

	public Tunel() {
		super();
	}

	

	public Tunel(Integer id, Integer ifIndex, Boolean state, Router router,
			Agency agency) {
		super();
		this.id = id;
	
		this.state = state;
		this.router = router;
		this.agency = agency;
	}

	@Id
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	@ManyToOne
	public Router getRouter() {
		return router;
	}

	public void setRouter(Router router) {
		this.router = router;
	}

	@ManyToOne
	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}

	

}
