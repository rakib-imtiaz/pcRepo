public class Player {
	private int numWins;
	private char symbol;
	private String name;

	public Player(char aSymbol, String aName) {
		this.symbol = aSymbol;
		this.name = aName;
		numWins = 0;
	}

	public void decrementwin()
	{
		numWins--;
	}
	public void addWin() {
		numWins += 1;
	}

	public char getSymbol() {
		return symbol;
	}

	public int getWins() {
		return numWins;
	}

	public String getName() {
		return name;
	}
}
