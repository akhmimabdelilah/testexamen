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
public class Piece {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pieceNo;
	private int nbOccupation;
	private int nbFenetres;

	@ManyToOne
	private Etage pieceEtage;
	@OneToMany(mappedBy = "piecePort", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Porte> portes;

	@ManyToOne
	private Piece pieceParent;
	@OneToMany(mappedBy = "pieceParent", fetch = FetchType.EAGER)
	private List<Piece> piecesParent;

	public Piece(int pieceNo, int nbOccupation, int nbFenetres, Etage pieceEtage) {
		super();
		this.pieceNo = pieceNo;
		this.nbOccupation = nbOccupation;
		this.nbFenetres = nbFenetres;
		this.pieceEtage = pieceEtage;
	}

	public Piece() {
		super();
	}

	public List<Porte> getPortes() {
		return portes;
	}

	public void setPortes(List<Porte> portes) {
		this.portes = portes;
	}

	public Etage getPieceEtage() {
		return pieceEtage;
	}

	public void setPieceEtage(Etage pieceEtage) {
		this.pieceEtage = pieceEtage;
	}

	public int getPieceNo() {
		return pieceNo;
	}

	public void setPieceNo(int pieceNo) {
		this.pieceNo = pieceNo;
	}

	public int getNbOccupation() {
		return nbOccupation;
	}

	public void setNbOccupation(int nbOccupation) {
		this.nbOccupation = nbOccupation;
	}

	public int getNbFenetres() {
		return nbFenetres;
	}

	public void setNbFenetres(int nbFenetres) {
		this.nbFenetres = nbFenetres;
	}

}
