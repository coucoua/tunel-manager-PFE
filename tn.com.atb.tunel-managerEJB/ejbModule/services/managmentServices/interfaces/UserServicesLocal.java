package services.managmentServices.interfaces;

import java.util.List;

import javax.ejb.Local;

import domain.User;

@Local
public interface UserServicesLocal {
	Boolean addUser(User user);

	User login(String login, String password);

	List<User> findAllUsers();
	
	Boolean updateUser(User user);
}
