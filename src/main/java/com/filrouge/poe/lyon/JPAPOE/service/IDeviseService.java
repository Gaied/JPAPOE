package com.filrouge.poe.lyon.JPAPOE.service;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.model.Devis;

public interface IDeviseService {
	
	List<Devis> listDevis();
	void ajouterDevis (Devis d);
	void modifierDevis (Devis d);
	void supprimerDevis (Devis d);
	Devis findDevis (Integer i);
	List<Devis> requetenamed (String requete);
	List<Devis> requetenamed (String requete, String...tab);

}
