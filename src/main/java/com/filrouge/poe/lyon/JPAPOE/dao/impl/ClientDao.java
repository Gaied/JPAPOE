package com.filrouge.poe.lyon.JPAPOE.dao.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IClientDao;
import com.filrouge.poe.lyon.JPAPOE.model.Client;

public class ClientDao extends EntityDao<Client> implements IClientDao {

	public ClientDao(Dao dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	public List<Client> listClients() {
		// TODO Auto-generated method stub
		return this.findAll(Client.class);
	}

	public void ajouterClient(Client c) {
		// TODO Auto-generated method stub
		this.add(c);
   
	}

	public void modifierClient(Client c) {
		// TODO Auto-generated method stub

	}

	public void supprimerClient(Client c) {
		// TODO Auto-generated method stub
        this.remove(Client.class, c);
	}

	public Client findClient(Integer i) {
		// TODO Auto-generated method stub
		return this.find(Client.class, i);
	}

	@Override
	public List<Client> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return this.requeteNamed(Client.class,requete);
	}

	@Override
	public List<Client> requetenamed(String requete, String... tab) {
		// TODO Auto-generated method stub
		return this.requeteNamed(Client.class,requete, tab);
	}

}
