package com.testexamen.testexamen.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Batiment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int batimentNo;
	private String Adresse;

	@OneToMany(mappedBy = "batimentEscalier", fetch = FetchType.EAGER)
	private List<Escalier> escaliers;
	@OneToMany(mappedBy = "batimentAscenseur", fetch = FetchType.EAGER)
	private List<Ascenseur> ascenseurs;
	@OneToMany(mappedBy = "batimentEtage",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Etage> etages;

	public Batiment() {
		super();
	}

	public Batiment(int batimentNo, String adresse) {
		super();
		this.batimentNo = batimentNo;
		Adresse = adresse;
	}

	
	
	public List<Ascenseur> getAscenseurs() {
		return ascenseurs;
	}

	public void setAscenseurs(List<Ascenseur> ascenseurs) {
		this.ascenseurs = ascenseurs;
	}

	public int getBatimentNo() {
		return batimentNo;
	}

	public List<Escalier> getEscaliers() {
		return escaliers;
	}

	public void setEscaliers(List<Escalier> escaliers) {
		this.escaliers = escaliers;
	}

	public void setBatimentNo(int batimentNo) {
		this.batimentNo = batimentNo;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

}
