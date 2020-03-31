package Pieces;
import Game.exeptions.PiecesMechanic;

public class torre extends geral{
	public torre(char letter, int number) throws PiecesMechanic{
		super ('T', 't', number, letter);
		if (number > 2) {
			throw new PiecesMechanic("Piece's number exception");
		}
		this.setAllNormalDirectionsTo(9);
	}
	
}
