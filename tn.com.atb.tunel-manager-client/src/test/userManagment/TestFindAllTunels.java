package test.userManagment;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.managmentServices.interfaces.TunelServicesRemote;
import domain.Tunel;

public class TestFindAllTunels {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		TunelServicesRemote proxy = (TunelServicesRemote) context
				.lookup("ejb:tn.com.atb.tunel-manager/tn.com.atb.tunel-managerEJB/TunelServices!services.managmentServices.interfaces.TunelServicesRemote");
		List<Tunel> tunels = proxy.findAllTunels();

		System.out.println(tunels.size());
	}

}
