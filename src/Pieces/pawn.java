package Pieces;

import Game.exeptions.PiecesMechanic;

public class pawn extends geral{
	public pawn(char letter, int number) throws PiecesMechanic{
		super ('T', 't', number, letter);
		if (number > 8) {
			throw new PiecesMechanic("Piece's number exception");
		}
		this.setUp(2);
	}
	@Override
	public int getUp() {
		if (this.up == 2) {
			int temp = this.up;
			this.setUp(1);
			return temp;
		}
		return this.up;
	}
}