package com.filrouge.poe.lyon.JPAPOE.service.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IDeviseDao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.DeviseDao;
import com.filrouge.poe.lyon.JPAPOE.model.Devis;
import com.filrouge.poe.lyon.JPAPOE.service.IDeviseService;

public class DeviseService implements IDeviseService {
	private IDeviseDao devisdao;
	
	public  DeviseService (Dao dao) {
		super();
		this.devisdao = new DeviseDao(dao);
	}

	@Override
	public List<Devis> listDevis() {
		// TODO Auto-generated method stub
		return this.devisdao.listDevis();
	}

	@Override
	public void ajouterDevis(Devis d) {
		// TODO Auto-generated method stub
		this.devisdao.ajouterDevis(d);
		
	}

	@Override
	public void modifierDevis(Devis d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerDevis(Devis d) {
		// TODO Auto-generated method stub
		this.devisdao.supprimerDevis(d);
		
	}

	@Override
	public Devis findDevis(Integer i) {
		// TODO Auto-generated method stub
		return this.devisdao.findDevis(i);
	}

	@Override
	public List<Devis> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Devis> requetenamed(String requete, String... tab) {
		// TODO Auto-generated method stub
		return null;
	}

}
