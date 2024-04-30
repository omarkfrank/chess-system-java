package boardgame;

public class Position {

	private int row;
	private int column;
	
	public Position(int row, int colum) {
		this.row = row;
		this.column = colum;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColum(int colum) {
		this.column = colum;
	}
	
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;		
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
}
