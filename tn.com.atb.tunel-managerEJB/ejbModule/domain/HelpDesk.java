package domain;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: HelpDesk
 * 
 */
@Entity
public class HelpDesk extends User implements Serializable {

	private String departement;
	private static final long serialVersionUID = 1L;

	public HelpDesk() {
		super();
	}

	public HelpDesk(String name, String login, String password,
			String department) {
		this.setName(name);
		this.setLogin(login);
		this.setPassword(password);
		this.setDepartement(department);
	}

	public String getDepartement() {
		return this.departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

}
