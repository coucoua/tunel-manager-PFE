package services.managmentServices.interfaces;

import java.util.List;

import javax.ejb.Local;

import domain.Tunel;

@Local
public interface TunelServicesLocal {
	List<Tunel> findAllTunels();
}
