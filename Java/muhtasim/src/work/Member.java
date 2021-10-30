package work;
public class Member extends Person {
private int idNo;
Member(String name,int age,String dateofbirth,int phonenumber,int idNo){
	super(name,age,dateofbirth,phonenumber);
	this.idNo=idNo;
}
public int getIdNo() {
	return idNo;
}
public void setIdNo(int idNo) {
	this.idNo = idNo;
}
@Override
public String toString() {
	return "Member [idNo=" + idNo + ", name=" + name + ", age=" + age + ", dateOfBirth=" + dateOfBirth
			+ ", phonenumber=" + phonenumber + "]";
}




}