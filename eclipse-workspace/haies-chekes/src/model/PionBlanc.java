package model;

import java.awt.Color;

public class PionBlanc extends Pion {
	
	public PionBlanc(Couleur c,Coord coord) {
		// TODO Auto-generated constructor stub
		super(Couleur.BLANC, coord);
	}
	@Override
	public boolean isMoveOk(int xFinal, int yFinal) {
		// TODO Auto-generated method stub
		boolean ret = false;
		
		if ( (this.getY()==6) && xFinal == this.getX() && Math.abs(yFinal-this.getY() ) <= 2 
				&& yFinal-this.getY() < 0 ){
			ret = true;
			}
		else if (xFinal == this.getX() && yFinal-this.getY() == -1 ) {
			ret = true;
		}
		return ret;	
	}
}
  