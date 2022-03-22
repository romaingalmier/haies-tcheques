package model;

import java.awt.Color;

class PionNoir extends Pion {
	
	public PionNoir(Coord coord) {
		// TODO Auto-generated constructor stub
		super(Couleur.NOIR, coord);
	}
	@Override
	public boolean isMoveOk(int xFinal, int yFinal) {
		// TODO Auto-generated method stub
		boolean ret = false;
		
		if ( (this.getY()==2) && xFinal == this.getX() && yFinal-this.getY()>= -2 
				&& yFinal-this.getY() < 0 ){
			ret = true;
			}
		else if (xFinal == this.getX() && yFinal-this.getY() == -1 ) {
			ret = true;
		}
		return ret;
	}
}
  