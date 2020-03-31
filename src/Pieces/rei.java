package Pieces;

import Game.exeptions.PiecesMechanic;

public class rei extends geral{
	public rei(char letter) throws PiecesMechanic {
		super('R', 'r', 1, letter);
		this.setAllDirectionsTo(1);
	}
}
