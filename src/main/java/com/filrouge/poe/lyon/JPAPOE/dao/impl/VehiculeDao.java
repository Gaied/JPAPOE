package com.filrouge.poe.lyon.JPAPOE.dao.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IVehiculeDao;
import com.filrouge.poe.lyon.JPAPOE.model.Vehicule;

public class VehiculeDao extends EntityDao<Vehicule> implements IVehiculeDao {

	public VehiculeDao(Dao dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Vehicule> listVehicule() {
		// TODO Auto-generated method stub
		return this.findAll(Vehicule.class);
	}

	@Override
	public void ajouterVehicule(Vehicule v) {
		// TODO Auto-generated method stub
			this.add(v);
	}

	@Override
	public void modifierVehicule(Vehicule v) {
		// TODO Auto-generated method stub
		this.remove(Vehicule.class, v);

	}

	@Override
	public void supprimerVehicule(Vehicule v) {
		// TODO Auto-generated method stub
		this.remove(Vehicule.class, v);

	}

	@Override
	public Vehicule findVehicule(Integer i) {
		// TODO Auto-generated method stub
		return this.find(Vehicule.class, i);
	}

}
