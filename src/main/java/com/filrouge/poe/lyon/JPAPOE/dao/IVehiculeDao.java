package com.filrouge.poe.lyon.JPAPOE.dao;

import java.util.List;
import com.filrouge.poe.lyon.JPAPOE.model.Vehicule;

public interface IVehiculeDao {
	
	List<Vehicule> listVehicule();
	void ajouterVehicule(Vehicule v);
	void modifierVehicule(Vehicule v);
	void supprimerVehicule(Vehicule v);
	Vehicule findVehicule (Integer i);

}
