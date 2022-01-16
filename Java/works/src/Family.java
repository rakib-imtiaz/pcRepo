
public class Family {
	/*
	 * Name = Shahnila ID= 1610450042 section = 12 course =cse215 lab phone number
	 * == 01705634679
	 */

	private int no_of_FamilyMember;
	private String typeOf_family;
	private String FamilySurName;
	private int no_of_WeddingAttended = 0;
	Physician physician;

//Constructors  without parameters	
	public Family() {

	}

	public Family(int no_of_FamilyMember, String typeOf_family, String familySurName, int no_of_WeddingAttended,
			Physician physician) {
		super();
		this.no_of_FamilyMember = no_of_FamilyMember;
		this.typeOf_family = typeOf_family;
		FamilySurName = familySurName;
		this.no_of_WeddingAttended = no_of_WeddingAttended;
		this.physician = physician;
	}

	public int getNo_of_FamilyMember() {
		return no_of_FamilyMember;
	}

	public void setNo_of_FamilyMember(int no_of_FamilyMember) {
		this.no_of_FamilyMember = no_of_FamilyMember;
	}

	public String getTypeOf_family() {
		return typeOf_family;
	}

	public void setTypeOf_family(String typeOf_family) {
		this.typeOf_family = typeOf_family;
	}

	public String getFamilySurName() {
		return FamilySurName;
	}

	public void setFamilySurName(String familySurName) {
		FamilySurName = familySurName;
	}

	public int getNo_of_WeddingAttended() {
		return no_of_WeddingAttended;
	}

	public void setNo_of_WeddingAttended(int no_of_WeddingAttended) {
		this.no_of_WeddingAttended = no_of_WeddingAttended;
	}

	public Physician getPhysician() {
		return physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public String toString() {// overriding the toString() method
		return "no_of_FamilyMember---" + no_of_FamilyMember + "  " + "family type---" + typeOf_family + "  "
				+ "FamilySurName---" + FamilySurName + "  " + "no_of_WeddingAttended---" + no_of_WeddingAttended;
	}

	public int weddingincrement() {
		no_of_WeddingAttended++;
		return no_of_WeddingAttended;
	}

};
