package eu.veldsoft.dice.overflow;

/**
 * 
 * @author Diana Dyulgerova
 */
class Board {
	/**
	 * 
	 */
	private Cell cells[][] = {
			{ new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0),
					new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0) },
			{ new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.RED, 6), new Cell(Cell.Type.EMPTY, 0),
					new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0) },
			{ new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0),
					new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0) },
			{ new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0),
					new Cell(Cell.Type.BLUE, 6), new Cell(Cell.Type.EMPTY, 0) },
			{ new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0),
					new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0) }, };

	/**
	 * 
	 * @return
	 */
	public Cell[][] getCells() {
		return cells;
	}

	/**
	 * 
	 */
	public void reset() {
		cells = new Cell[][] {
				{ new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0),
						new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0) },
				{ new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.RED, 6), new Cell(Cell.Type.EMPTY, 0),
						new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0) },
				{ new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0),
						new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0) },
				{ new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0),
						new Cell(Cell.Type.BLUE, 6), new Cell(Cell.Type.EMPTY, 0) },
				{ new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0),
						new Cell(Cell.Type.EMPTY, 0), new Cell(Cell.Type.EMPTY, 0) }, };
	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public void click(int x, int y) {
	}
}
