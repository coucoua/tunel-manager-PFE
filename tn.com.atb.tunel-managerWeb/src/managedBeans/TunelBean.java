package managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import services.managmentServices.interfaces.TunelServicesLocal;
import domain.Tunel;

@ManagedBean
@ViewScoped
public class TunelBean {
	private List<Tunel> tunels = new ArrayList<>();
	private List<Tunel> filtredTunels=new ArrayList<>();
	@EJB
	private TunelServicesLocal tunelServicesLocal;

	public List<Tunel> getTunels() {
		tunels = tunelServicesLocal.findAllTunels();
		return tunels;
	}

	public void setTunels(List<Tunel> tunels) {
		this.tunels = tunels;
	}

	public List<Tunel> getFiltredTunels() {
		return filtredTunels;
	}

	public void setFiltredTunels(List<Tunel> filtredTunels) {
		this.filtredTunels = filtredTunels;
	}

}
