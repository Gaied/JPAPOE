package com.filrouge.poe.lyon.JPAPOE.service.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IVehiculeDao;

import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.VehiculeDao;
import com.filrouge.poe.lyon.JPAPOE.model.Vehicule;
import com.filrouge.poe.lyon.JPAPOE.service.IVehciculeService;

public class VehiculeService implements IVehciculeService {
	
private IVehiculeDao vehiculedao;
	
	public 	VehiculeService (Dao dao) {
		super();
		this.vehiculedao = new VehiculeDao(dao);
	}

	@Override
	public List<Vehicule> listVehicules() {
		// TODO Auto-generated method stub
		return this.vehiculedao.listVehicule();
	}

	@Override
	public void ajouterVehicule(Vehicule v) {
		// TODO Auto-generated method stub
		this.vehiculedao.ajouterVehicule(v);
	}

	@Override
	public void modifierVehicule(Vehicule v) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerVehicule(Vehicule v) {
		// TODO Auto-generated method stub
		this.vehiculedao.supprimerVehicule(v);

	}

	@Override
	public Vehicule findVehicule(Integer i) {
		// TODO Auto-generated method stub
		return this.vehiculedao.findVehicule(i);
	}

}
