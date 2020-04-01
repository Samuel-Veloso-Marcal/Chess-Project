package Pieces;

import Game.exeptions.PiecesMechanic;

public class bispo extends geral{
	public bispo(char letter, int number) throws PiecesMechanic{
		super ('B', 'b', number, letter);
		if (number > 2) {
			throw new PiecesMechanic("Piece's number exception");
		}
		this.setAllOthersDirectionsTo(9);
	}
}
