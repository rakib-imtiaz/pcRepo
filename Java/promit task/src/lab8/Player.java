package lab8;

public class Player implements Comparable<Player> {

	private String name;
	private int score;

	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Player p) {

		if (this.score <= p.score)

			return 1;
		else if (this.score == p.score)
			return 0;
		else
			return -1;

	}

}
