package managedBeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import services.managmentServices.interfaces.UserServicesLocal;
import domain.Admin;
import domain.HelpDesk;
import domain.User;

@ManagedBean
@SessionScoped
public class UserBean {
	private User user = new User();
	@EJB
	private UserServicesLocal userServicesLocal;

	public String doLogin() {
		try {
			user = userServicesLocal.login(user.getLogin(), user.getPassword());
			if (user instanceof Admin) {
				return "/listTunels?faces-redirect=true";
			} else if (user instanceof HelpDesk) {
				System.out.println("helpDesk");
			}

		} catch (Exception e) {
			return "ko";
		}

		return "";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
