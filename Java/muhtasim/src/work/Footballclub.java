package work;
public class Footballclub extends Club implements imple{
private int DivisionNo;
private int noOfWorldcups;
private String leagueName;
private int noOfPlayers;
Player players[];

public Footballclub(String name, int year, int size, int divisionNo, String leagueName,int noOfWorldcups) {
	super(name, year);
	DivisionNo = divisionNo;
	this.leagueName = leagueName;
	this.noOfWorldcups=noOfWorldcups;
	players=new Player[size];
}
public void addPlayer(Player o,int index) {
	try {
	players[index]=o;
	}catch(Exception e) {
		System.out.println("ARRAY INDEX LIMIT SURPASSED");
	}
}
Player[] play() {
	return players;
}
Player playdex(int index) {
	return players[index];
}
public void addPlayer(Player p) {
	players[noOfPlayers++]=p;
}
public void highestPaid() {
	int max=0;
	for(int i=1;i<players.length;i++) {
		if(players[i].getSalary()>players[max].getSalary()) {
			max=i;
		}
	}
	System.out.println(players[max]);
}


public int getNoOfWorldcups() {
	return noOfWorldcups;
}

public void setNoOfWorldcups(int noOfWorldcups) {
	this.noOfWorldcups = noOfWorldcups;
}

public int getDivisionNo() {
	return DivisionNo;
}
public void setDivisionNo(int divisionNo) {
	DivisionNo = divisionNo;
}
public String getLeagueName() {
	return leagueName;
}
public void setLeagueName(String leagueName) {
	this.leagueName = leagueName;
}


public String toString() {
	return "Footballclub [DivisionNo=" + DivisionNo + ", leagueName=" + leagueName + ", name=" + name
			+ ", yearOfEstablishment=" + yearOfEstablishment + "]";
}







}
