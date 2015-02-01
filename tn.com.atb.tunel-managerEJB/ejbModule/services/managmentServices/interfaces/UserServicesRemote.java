package services.managmentServices.interfaces;

import javax.ejb.Remote;

import domain.User;

@Remote
public interface UserServicesRemote {
	Boolean addUser(User user);
	User login(String login,String password);

}
