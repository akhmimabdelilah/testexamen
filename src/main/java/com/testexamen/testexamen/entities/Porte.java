package com.testexamen.testexamen.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Porte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	private Piece piecePort;

	public Porte() {
		super();
	}

	public Porte(int id, Piece piecePort) {
		super();
		this.id = id;
		this.piecePort = piecePort;
	}

	public Piece getPiecePort() {
		return piecePort;
	}

	public void setPiecePort(Piece piecePort) {
		this.piecePort = piecePort;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
