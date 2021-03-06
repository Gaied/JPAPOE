package com.filrouge.poe.lyon.JPAPOE.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "vehicule")
public class Vehicule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "modele", length = 50, nullable = false)
	private String modele;

	@Column(name = "quantite", length = 11, nullable = false)
	private Integer quantite;

	@Column(name = "prixHT")
	private double prixHT;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_creation", nullable = false)
	private Date date_creation;
	
	@OneToMany(mappedBy = "vehicule", fetch = FetchType.LAZY)
	private List<Devis> listeDevis;

	public List<Devis> getListeDevis() {
		return listeDevis;
	}

	public void setListeDevis(List<Devis> listeDevis) {
		this.listeDevis = listeDevis;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public Date getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}

	@Override
	public String toString() {
		return "Vehicule [id=" + id + ", modele=" + modele + ", quantite=" + quantite + ", prixHT=" + prixHT
				+ ", date_creation=" + date_creation + "]";
	}

}
