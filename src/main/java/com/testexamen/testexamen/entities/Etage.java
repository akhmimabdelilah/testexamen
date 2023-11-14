package com.testexamen.testexamen.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Etage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int etageNo;

	@ManyToOne
	private Batiment batimentEtage;
	@OneToMany(mappedBy = "pieceEtage", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Piece> pieces;

	public Etage() {
		super();
	}

	public Etage(int etageNo, Batiment batimentEtage) {
		super();
		this.etageNo = etageNo;
		this.batimentEtage = batimentEtage;
	}

	public List<Piece> getPieces() {
		return pieces;
	}

	public void setPieces(List<Piece> pieces) {
		this.pieces = pieces;
	}

	public Batiment getBatimentEtage() {
		return batimentEtage;
	}

	public void setBatimentEtage(Batiment batimentEtage) {
		this.batimentEtage = batimentEtage;
	}

	public int getEtageNo() {
		return etageNo;
	}

	public void setEtageNo(int etageNo) {
		this.etageNo = etageNo;
	}

}
