package test.userManagment;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.managmentServices.interfaces.UserServicesRemote;
import domain.Admin;
import domain.HelpDesk;

public class TestAddUser {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		String jndiName = "ejb:tn.com.atb.tunel-manager/tn.com.atb.tunel-managerEJB/UserServices!"
				+ UserServicesRemote.class.getCanonicalName();
		UserServicesRemote proxy = (UserServicesRemote) context
				.lookup(jndiName);

		Admin admin = new Admin("meher", "a", "a", "azerty");
		HelpDesk helpDesk = new HelpDesk("ahlem", "b", "b", "info");

		proxy.addUser(admin);
		proxy.addUser(helpDesk);

	}

}
