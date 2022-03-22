package model;

class Roi extends AbstractPieces {
	
	public Roi(Couleur couleur ,Coord coord) {
		// TODO Auto-generated constructor stub
		super(couleur, coord);
	}
	@Override
	public boolean isMoveOk(int xFinal, int yFinal) {
		// TODO Auto-generated method stub
		boolean ret = false;
		
		if ( Math.abs(xFinal - this.getX()) <= 1 && 
				Math.abs(yFinal- this.getY()) <= 1) {
			ret = true;
		}
		return ret;
	}
}
  