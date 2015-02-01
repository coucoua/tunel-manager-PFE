package test.userManagment;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.managmentServices.interfaces.UserServicesRemote;
import domain.User;

public class TestLogin {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		String jndiName = "ejb:tn.com.atb.tunel-manager/tn.com.atb.tunel-managerEJB/UserServices!"
				+ UserServicesRemote.class.getCanonicalName();
		UserServicesRemote proxy = (UserServicesRemote) context
				.lookup(jndiName);

		User user = proxy.login("a", "a");
		System.out.println(user.getName());

	}

}
