package model;

import java.awt.Color;

abstract class Pion extends AbstractPieces {
	
	public Pion(Couleur couleur ,Coord coord) {
		// TODO Auto-generated constructor stub
		super(couleur, coord);
	}
	
	@Override
	public boolean isMoveOk(int xFinal, int yFinal) {
		// TODO x = xfinal
		return false;
	}
	}
  