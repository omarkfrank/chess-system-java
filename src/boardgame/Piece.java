package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null; // por padr�o, o Java deixa como nulo e por didatica/destacar decidi atribuir
							// por conta o valor nulo.
	}

	protected Board getBoard() { // Aqui somente as classes dentro do mesmo pacote e subclasses v�o poder acessar
									// o board/pe�a.
		return board;
	}

	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) { // Aqui o metodo concreto(possibleMove)est� utilizando o metodo
														// abstrato(possibleMoves), � chamado de hook method, quando faz
														// um "gancho com a subclasse".
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
