package model;
import java.util.List;
import tools.ChessPiecesFactory;

public class Jeu {
	List<Pieces> listePiece;
	
	public Jeu(Couleur couleur) {
		this.listePiece =  ChessPiecesFactory.newPieces(couleur);
}

	@Override
	public String toString() {
		String ret = "Jeu : ";
		for (Pieces pieces : listePiece) {
			ret += pieces.toString() +"\n";
			
		}
		return ret;
	}
	public static void main(String argv[]) {
		Jeu jeu = new Jeu(Couleur.NOIR);
		System.out.println(jeu);
	}
}
