package assignment2.section2;

public class FootballClub extends Club {
	private int numberofTrainingkits;
	private int numberoFFootballs;


	public FootballClub(String name, String location, Member[] memberList) {
		super(name, location, memberList);
	}
	public FootballClub(String name, String location, Member[] memberList, int numberofTrainingkits,
			int numberoFFootballs) {
		super(name, location, memberList);
		this.numberofTrainingkits = numberofTrainingkits;
		this.numberoFFootballs = numberoFFootballs;
	}


	public FootballClub() {
		// TODO Auto-generated constructor stub
	}
	public int getNumberofTrainingkits() {
		return numberofTrainingkits;
	}

	public void setNumberofTrainingkits(int numberofTrainingkits) {
		this.numberofTrainingkits = numberofTrainingkits;
	}

	public int getNumberoFFootballs() {
		return numberoFFootballs;
	}

	public void setNumberoFFootballs(int numberoFFootballs) {
		this.numberoFFootballs = numberoFFootballs;
	}

	@Override
	public String toString() {
		return "FootballClub [numberofTrainingkits=" + numberofTrainingkits + ", numberoFFootballs=" + numberoFFootballs
				+ "]";
	}

}
