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
	
	abstract public boolean isMoveOk(int xFinal,int yFinal);
	
	public boolean move(int x , int y) {
		boolean ret = false;
		if (this.isMoveOk(x, y)) {
			this.coord.x = x;
			this.coord.y = y;	
			ret = true;
		}
		return ret;
	}

	public boolean capture() {
		//TODO
		return true;
	}

	public static void main(String argv[]) {
		
		Pieces tour = new Tour(Couleur.NOIR,new Coord(0,0));
		Pieces roi = new Roi(Couleur.NOIR,new Coord(4,4));
		Pieces reine = new Reine(Couleur.NOIR,new Coord(4,4));
	
	}

}