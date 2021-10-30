package assignment2.section2;

public class Member extends Player{
	
	private String memberID;
	private String memberpass;
	public Member(String memberID, String memberpass) {
		super();
		this.memberID = memberID;
		this.memberpass = memberpass;
	}
	public Member() {
		super();
	}
	
	public Member(Player player2) {
		// TODO Auto-generated constructor stub
	}
	public String getMemberID() {
		return memberID;
	}
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	public String getMemberpass() {
		return memberpass;
	}
	public void setMemberpass(String memberpass) {
		this.memberpass = memberpass;
	}
	@Override
	public String toString() {
		return "Member [memberID=" + memberID + ", memberpass=" + memberpass + "]";
	}
	

}
