package services.managmentServices.interfaces;

import java.util.List;

import javax.ejb.Remote;

import domain.Tunel;

@Remote
public interface TunelServicesRemote {
	List<Tunel> findAllTunels();

}
