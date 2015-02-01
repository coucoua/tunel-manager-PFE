package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Routeur
 * 
 */
@Entity
public class Router implements Serializable {

	private Integer serialNumber;
	private static final long serialVersionUID = 1L;

	private List<Tunel> tunels;

	public Router() {
		super();
	}

	@Id
	public Integer getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	@OneToMany(mappedBy = "router")
	public List<Tunel> getTunels() {
		return tunels;
	}

	public void setTunels(List<Tunel> tunels) {
		this.tunels = tunels;
	}

}
