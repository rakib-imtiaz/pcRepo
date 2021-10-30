package assignment2.section2;

import java.util.Arrays;

public class Club {

	private String name;
	private String location;
	private static int numberOFmembers = 0;
	private Member memberList[]= new Member[100];
	
	

	public Club() {
		super();
	}



	public Club(String name, String location, Member[] memberList) {
		super();
		this.name = name;
		this.location = location;
		this.memberList = memberList;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public static int getNumberOFmembers() {
		return numberOFmembers;
	}



	public static void setNumberOFmembers(int numberOFmembers) {
		Club.numberOFmembers = numberOFmembers;
	}



	public Member[] getMemberList() {
		return memberList;
	}



	public void setMemberList(Member[] memberList) {
		this.memberList = memberList;
	}



	public void addMembers(Member memberObj) {
//		memberList= new Member[numberOFmembers++];

		memberList[this.numberOFmembers]=memberObj;
		numberOFmembers++;
		

	}



	@Override
	public String toString() {
		return "Club [name=" + name + ", location=" + location + ", memberList=" + Arrays.toString(memberList) + "]";
	}
	
	

}
