package domain;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Admin
 * 
 */
@Entity
public class Admin extends User implements Serializable {

	private String secretToken;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}

	public Admin(String name, String login, String password, String secretToken) {
		this.setName(name);
		this.setLogin(login);
		this.setPassword(password);
		this.setSecretToken(secretToken);
	}

	public String getSecretToken() {
		return this.secretToken;
	}

	public void setSecretToken(String secretToken) {
		this.secretToken = secretToken;
	}

}
