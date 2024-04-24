package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //por padr�o, o Java deixa como nulo e por didatica/destacar decidi atribuir por conta o valor nulo. 
	}

	protected Board getBoard() { //Aqui somente as classes dentro do mesmo pacote e subclasses v�o poder acessar o board/pe�a.
		return board;
	}
}
