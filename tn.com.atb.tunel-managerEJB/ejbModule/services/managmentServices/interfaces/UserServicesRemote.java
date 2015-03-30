package services.managmentServices.interfaces;

import java.util.List;

import javax.ejb.Remote;

import domain.User;

@Remote
public interface UserServicesRemote {
	Boolean addUser(User user);
	User login(String login,String password);
	List<User> findAllUsers();
	Boolean updateUser(User user);

}
