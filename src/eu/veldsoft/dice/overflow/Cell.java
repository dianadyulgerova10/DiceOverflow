package eu.veldsoft.dice.overflow;

/**
 * 
 */
class Cell {
	/**
	 * 
	 */
	enum Type {
		EMPTY, RED, BLUE,
	}

	/**
	 * 
	 */
	private Type type;

	/**
	 * 
	 */
	private int score;

	/**
	 * 
	 */
	public Cell(Type type, int score) {
		this.type = type;
		this.score = score;
	}

	/**
	 * 
	 */
	public Type getType() {
		return type;
	}

	/**
	 * 
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * 
	 */
	public int getScore() {
		return score;
	}

	/**
	 * 
	 */
	public void setScore(int score) {
		this.score = score;
	}
}
