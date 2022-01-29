package boardgame;

public class Board {
	
	private Integer columns;
	private Integer rows;
	private Piece[][] pieces;
	
	public Board(Integer line, Integer row) {
		super();
		this.columns = line;
		this.rows = row;
		if(rows<1 || columns<1) {
			throw new BoardException("ERROR: Invalid board size, rows and columns must be major than 1.");
		}
		pieces = new Piece[rows][columns];
	}

	public Integer getColumns() {
		return columns;
	}

	public Integer getRows() {
		return rows;
	}

	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("ERROR: Position not exits on the board.");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("ERROR: Position not exits on the board.");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece (Piece piece, Position position) {
		if(thereisAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public boolean positionExists(int row, int column) {
		return ((row>=0 && row < rows) && (column>=0 && column < columns));
		//return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		
		return positionExists(position.getRow(), position.getColumn());
	}
	public boolean thereisAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("ERROR: Position not exits on the board.");
		}
		return piece(position) != null;
	}
}
