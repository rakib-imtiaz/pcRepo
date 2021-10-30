package assignment2.section2;

public class CricketClub  extends Club{
	
	private int numberOfbats;
	private int trainingkit;
	
	
	
	
	public CricketClub() {
		super();
	}
	public CricketClub(String name, String location, Member[] memberList) {
		super(name, location, memberList);
	}
	public CricketClub(String name, String location, Member[] memberList, int numberOfbats, int trainingkit) {
		super(name, location, memberList);
		this.numberOfbats = numberOfbats;
		this.trainingkit = trainingkit;
	}
	public int getNumberOfbats() {
		return numberOfbats;
	}
	public void setNumberOfbats(int numberOfbats) {
		this.numberOfbats = numberOfbats;
	}
	public int getTrainingkit() {
		return trainingkit;
	}
	public void setTrainingkit(int trainingkit) {
		this.trainingkit = trainingkit;
	}
	@Override
	public String toString() {
		return "CricketClub [numberOfbats=" + numberOfbats + ", trainingkit=" + trainingkit + "]";
	}
	
	

}
