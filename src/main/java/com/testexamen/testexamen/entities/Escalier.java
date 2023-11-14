package com.testexamen.testexamen.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Escalier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int escalierNo;
	
	@ManyToOne
	private Batiment batimentEscalier;

	public Escalier() {
		super();
	}

	public Escalier(int escalierNo,Batiment batimentEscalier) {
		super();
		this.escalierNo = escalierNo;
		this.batimentEscalier=batimentEscalier;
	}

	
	
	public Batiment getBatiment() {
		return batimentEscalier;
	}

	public void setBatiment(Batiment batiment) {
		this.batimentEscalier = batiment;
	}

	public int getEscalierNo() {
		return escalierNo;
	}

	public void setEscalierNo(int escalierNo) {
		this.escalierNo = escalierNo;
	}

}
