package Pieces;

import Game.exeptions.PiecesMechanic;

public class cavalo extends geral{
	public cavalo(char letter, int number) throws PiecesMechanic{
		super ('C', 'c', number, letter);
		if (number > 2) {
			throw new PiecesMechanic("Piece's number exception");
		}
		this.setAllDirectionsTo(3);
	}
}
