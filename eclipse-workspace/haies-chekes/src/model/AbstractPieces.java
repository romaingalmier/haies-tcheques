package model;


abstract class AbstractPieces implements Pieces {
	
	private Coord coord ;
	private final Couleur couleur__de_piece;
	
	public AbstractPieces(Couleur couleur,Coord coord) {
		this.coord = coord;
		this.couleur__de_piece = couleur;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String ret = "";
		ret  = getClass().getSimpleName() + " en x = " + coord.x + " y = " + coord.y ;
		return ret;
	}
	
	
	public int getX() {
		Coord coord = new Coord(this.coord.x,this.coord.y);
		return coord.x;
	}
	public int getY() {
		Coord coord = new Coord(this.coord.x,this.coord.y);
		return coord.y;
	}
	

	public Couleur getCouleur() {
		return couleur__de_piece;
	}
	public boolean move() {
		//todo
		return true;
	}

	public boolean capture() {
		
	}

	public void main() {
		
		Pieces tour= new Tour(Couleur.NOIR,new Coord(0,0));
		tour.toString();
		
	}

}