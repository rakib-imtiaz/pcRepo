
public class Player {

	private boolean rock;
	private boolean paper;
	private boolean scissor;

	public Player() {

	}

	public Player(boolean rock, boolean paper, boolean scissor) {
		super();
		this.rock = rock;
		this.paper = paper;
		this.scissor = scissor;
	}

	public boolean isRock() {
		return rock;
	}

	public void setRock(boolean rock) {
		this.rock = rock;
	}

	public boolean isPaper() {
		return paper;
	}

	public void setPaper(boolean paper) {
		this.paper = paper;
	}

	public boolean isScissor() {
		return scissor;
	}

	public void setScissor(boolean scissor) {
		this.scissor = scissor;
	}

}
