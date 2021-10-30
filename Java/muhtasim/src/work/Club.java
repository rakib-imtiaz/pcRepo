package work;
public class Club {
public String name;
public int yearOfEstablishment;
private static int noOfMembers;
private Member members[];
Club(String name,int year){
	this.name=name;
	yearOfEstablishment=year;
	
}
Club(String name,int year,int x){
	this.name=name;
	yearOfEstablishment=year;
	members=new Member[x];
}

public int getNoOfMembers() {
	return noOfMembers;
}
public void addMembers(Member o,int index) {
	members[index]=o;
}
public void addMembers(Member o) {
	members[noOfMembers++]=o;
}
public Member mem(int index) {
	return members[index];
} 
public Member[] memberarray() {
	return members;
}
public void searchmember(int x) {
	for(int i=0;i<members.length;i++) {
		if(members[i].getIdNo()==x) {
			System.out.println(members[i]);
		}
	}
	
}
public String toString() {
	return "Club [name=" + name + ", yearOfEstablishment=" + yearOfEstablishment + ", noOfMembers=" + noOfMembers
			+ ", members=" + members + "]";
}


}