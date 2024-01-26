package com.testexamen.testexamen.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Ascenseur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ascenseurNo;

	@ManyToOne
	private Batiment batimentAscenseur;

	public Ascenseur() {
		super();
	}

	public Ascenseur(int ascenseurNo, Batiment batimentAscenseur) {
		super();
		this.ascenseurNo = ascenseurNo;
		this.batimentAscenseur = batimentAscenseur;
	}

	public Batiment getBatimentAscenseur() {
		return batimentAscenseur;
	}

	public void setBatimentAscenseur(Batiment batimentAscenseur) {
		this.batimentAscenseur = batimentAscenseur;
	}

	public int getAscenseurNo() {
		return ascenseurNo;
	}

	public void setAscenseurNo(int ascenseurNo) {
		this.ascenseurNo = ascenseurNo;

	}

}
