package model;

public class Cavalier extends AbstractPieces {
	
	public Cavalier(Couleur couleur ,Coord coord) {
		// TODO Auto-generated constructor stub
		super(couleur, coord);
	}
	@Override
	public boolean isMoveOk(int xFinal, int yFinal) {
		// TODO Auto-generated method stub
		boolean ret = false;
		if (( Math.abs(xFinal- getX())+ Math.abs(yFinal- getY()) == 3 )&&
				(Math.abs(xFinal- getX())<=2 && Math.abs(yFinal- getY())<=2 )){
			ret = true;
		}
		return ret;
	}
}
  