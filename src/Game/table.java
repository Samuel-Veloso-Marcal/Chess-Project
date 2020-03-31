 package Game;

import Game.exeptions.PiecesMechanic;
import Pieces.dama;
import Pieces.geral;

public class table {
	private geral table[][] = new geral[9][9];
	public table() {
	}
	@Override
	public String toString() {
	String y ="     ---------------------------------------    ----"+ String.format("%n") + "    | ";
			for (int i = 1; i<=8; i++) {
				try {
				for(int o = 0; o<8; o++) {
					table[i][o] = new dama('l');
					y = y + table[i][o].getCode() + " | ";
				}
				y = y
					+ " | 0" + i + " |" + String.format("%n")
 					+ "     ---------------------------------------    ----"
					+ String.format("%n")
					+ "    ";
				if (i<8) {
					y = y + "| ";
				}}
				catch (PiecesMechanic x) {
					System.out.println(x);
				}
			}
		
		y = y
			+ " ---------------------------------------    ----"
			+ String.format("%n")
			+ "    | 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 |  |    |"
			+ String.format("%n")
			+ "     ---------------------------------------    ----";
		return y;
	}
}
