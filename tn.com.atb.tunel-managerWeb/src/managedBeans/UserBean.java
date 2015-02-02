package managedBeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

import services.managmentServices.interfaces.UserServicesLocal;
import domain.Admin;
import domain.HelpDesk;
import domain.User;

@ManagedBean
@SessionScoped
public class UserBean {
	private User user = new User();
	private List<User> users;
	private List<User> filtredUsers;

	@EJB
	private UserServicesLocal userServicesLocal;

	@PostConstruct
	public void init() {
		users = userServicesLocal.findAllUsers();
	}

	public void onRowEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Car Edited",
				((User) event.getObject()).getLogin());
		FacesContext.getCurrentInstance().addMessage(null, msg);
		System.out.println((user.getLogin()));
		userServicesLocal.updateUser((User) event.getObject());
	}

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

	public List<User> getUsers() {
		users = userServicesLocal.findAllUsers();
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<User> getFiltredUsers() {
		return filtredUsers;
	}

	public void setFiltredUsers(List<User> filtredUsers) {
		this.filtredUsers = filtredUsers;
	}

}
