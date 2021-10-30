package assignment2.section2;

public class Main {
	
	public static void main(String[] args) {
		//cricket player
		
		Player player1 =new Player();
		player1.setAge(29);
		player1.setExperience(3.5);
		player1.setJoining_date("12/12/2018");
		player1.setName("Albaj");
		
		Member newMember = new Member(player1);
		newMember.setMemberID("12345");
		newMember.setMemberpass("pass123");
		
		CricketClub club1 = new CricketClub();
		club1.addMembers(newMember);
		
		System.out.println(player1);
		System.out.println(newMember);
		System.out.println();
		System.out.println();
		
		//football player
		

		Player player2 =new Player();
		player2.setAge(34);
		player2.setExperience(5);
		player2.setJoining_date("22/09/2014");
		player2.setName("Nulfan");
		
		Member newMember2 = new Member(player2);
		newMember2.setMemberID("12345");
		newMember2.setMemberpass("pass123");
		
		FootballClub club2 = new FootballClub();
		club2.addMembers(newMember2);
		System.out.println(player2);
		System.out.println(newMember2);

		
		
	}

}
