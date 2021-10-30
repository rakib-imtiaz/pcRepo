package work;
import java.util.Arrays;

public class Cricketclub extends Club implements imple {
	private Player players[];
	private static int noOfPlayers;

	public Cricketclub(String name, int year, int size) {
		super(name, year);
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
	@Override
	public String toString() {
		return "Cricketclub [name=" + name + ", yearOfEstablishment=" + yearOfEstablishment + "]";
	}
	
	
	
	

	

}