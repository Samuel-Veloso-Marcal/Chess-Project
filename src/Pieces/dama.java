package Pieces;

import Game.exeptions.PiecesMechanic;
public class dama extends geral {
	public dama(char letter) throws PiecesMechanic {
		super('D', 'd', 1, letter);
		this.setAllDirectionsTo(9);
	}
}
