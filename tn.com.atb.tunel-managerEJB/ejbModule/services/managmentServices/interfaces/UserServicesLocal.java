package services.managmentServices.interfaces;

import javax.ejb.Local;

import domain.User;

@Local
public interface UserServicesLocal {
	Boolean addUser(User user);

	User login(String login, String password);
}
