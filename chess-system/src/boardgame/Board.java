package boardgame;

public class Board {
	
	private Integer columns;
	private Integer rows;
	private Piece[][] pieces;
	
	public Board(Integer line, Integer row) {
		super();
		this.columns = line;
		this.rows = row;
		pieces = new Piece[rows][columns];
	}

	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece (Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

}
