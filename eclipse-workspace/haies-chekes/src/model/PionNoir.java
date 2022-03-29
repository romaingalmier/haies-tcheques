package model;

import java.awt.Color;

public class PionNoir extends Pion {
	
	public PionNoir(Couleur c,Coord coord) {
		// TODO Auto-generated constructor stub
		super(Couleur.NOIR, coord);
	}
	@Override
	public boolean isMoveOk(int xFinal, int yFinal) {
		// TODO Auto-generated method stub
		
		boolean ret = false;
		
		if ( (this.getY()==1) && xFinal == this.getX() && yFinal-this.getY() <=2 
				&& yFinal-this.getY() > 0 ){
			ret = true;
			}
		else if (yFinal-this.getY()==1 && yFinal-this.getY() > 0) {
			ret = true;
		}
		return ret;
	}
}
  