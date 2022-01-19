package boardgame;

public class Board {
	
	private Integer columns;
	private Integer rows;
	private Piece[][] piece;
	
	public Board(Integer line, Integer row) {
		super();
		this.columns = line;
		this.rows = row;
		piece = new Piece[rows][columns];
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
	
	
	

}
