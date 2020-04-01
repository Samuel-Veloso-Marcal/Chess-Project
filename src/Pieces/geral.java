package Pieces;

import Game.exeptions.PiecesMechanic;

public class geral {
	private boolean live = true;
	private String code =  "";
	protected int up = 0;
	private int down = 0;
	private int left = 0;
	private int right = 0;
	private int upper_left = 0;
	private int upper_right = 0;
	private int down_left = 0;
	private int down_right = 0;
	private int moves = up + down + left + right+ upper_left + upper_right + down_left + down_right;

	public geral() {
		this.code = "  ";
	}
	public geral(char upperLetter, char lowerLetter, int num, char chari) throws PiecesMechanic{
		if (chari == 'c') {
		this.code += upperLetter + String.format("%d",num);
		} else {
			if (chari == 'l') {
				this.code += lowerLetter + String.format("%d",num);
			} else {
				throw new PiecesMechanic("Character size option not corretly defined.");
			}
		}
	}
	public void die() throws PiecesMechanic{
		if (this.live = true) {
			this.live = false;
		}
		else {
			throw new PiecesMechanic("The piece is already dead.");
		}
	}
	public boolean getLive() {
		return this.live;
	}
	public String getCode(){
		return this.code;
	}
	public String toStrig() {
		return this.code;
	}
	public void move() {
		
	}
	public int getUp() {
		return up;
	}
	public int getDown() {
		return down;
	}
	public int getLeft() {
		return left;
	}
	public int getRight() {
		return right;
	}
	public int getUpper_left() {
		return upper_left;
	}
	public int getUpper_right() {
		return upper_right;
	}
	public int getDown_left() {
		return down_left;
	}
	public int getDown_right() {
		return down_right;
	}
	public int getMoves() {
		return this.moves;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public void setUp(int up) {
		this.up = up;
	}
	public void setAllNormalDirections(int u, int d, int l, int r) {
		this.setUp(u); this.setDown(d);
		this.setRight(r); this.setLeft(l);
	}
	public void setAllNormalDirectionsTo(int n) {
		this.setAllNormalDirections(n, n, n, n);
	}
	public void setAllOthersDirections(int ul, int ur, int dl, int dr) {
		this.setDown_left(dl); this.setDown_right(dr);
		this.setUpper_right(ur); this.setUpper_left(ul);
	}
	public void setAllOthersDirectionsTo(int n) {
		this.setAllOthersDirections(n, n, n, n);
	}
	public void setAllDirections(int u, int d, int l, int r, int dl, int dr, int ul, int ur) {
		this.setAllNormalDirections(u, dr, ul, ur);
		this.setAllOthersDirections(ul, ur, dl, dr);
	}
	public void setAllDirectionsTo(int alt) {
		this.setAllNormalDirectionsTo(alt);
		this.setAllOthersDirectionsTo(alt);
	}
	public void setDown(int down) {
		this.down = down;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public void setUpper_left(int upper_left) {
		this.upper_left = upper_left;
	}
	public void setUpper_right(int upper_right) {
		this.upper_right = upper_right;
	}
	public void setDown_left(int down_left) {
		this.down_left = down_left;
	}
	public void setDown_right(int down_right) {
		this.down_right = down_right;
	}
	public void setMoves(int moves) {
		this.moves = moves;
	}
	
}
