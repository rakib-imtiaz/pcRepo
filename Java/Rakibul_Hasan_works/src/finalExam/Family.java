package finalExam;

public class Family {
	private int numberOfFamilyMembers;
	private String typeOfFamily;
	private String familySurname;
	private static int numberOfWeddingAttended = 0;
	private Physician housePhysician;

	public Family() {
		// TODO Auto-generated constructor stub
	}

	public Family(int numberOfFamilyMembers, String typeOfFamily, String familySurname, Physician housePhysician) {
		super();
		this.numberOfFamilyMembers = numberOfFamilyMembers;
		this.typeOfFamily = typeOfFamily;
		this.familySurname = familySurname;
		this.housePhysician = housePhysician;
	}

	public int getNumberOfFamilyMembers() {
		return numberOfFamilyMembers;
	}

	public void setNumberOfFamilyMembers(int numberOfFamilyMembers) {
		this.numberOfFamilyMembers = numberOfFamilyMembers;
	}

	public String getTypeOfFamily() {
		return typeOfFamily;
	}

	public void setTypeOfFamily(String typeOfFamily) {
		this.typeOfFamily = typeOfFamily;
	}

	public String getFamilySurname() {
		return familySurname;
	}

	public void setFamilySurname(String familySurname) {
		this.familySurname = familySurname;
	}

	public int getNumberOfWeddingAttended() {
		return numberOfWeddingAttended;
	}

	public void setNumberOfWeddingAttended(int numberOfWeddingAttended) {
		this.numberOfWeddingAttended = numberOfWeddingAttended;
	}

	public Physician getHousePhysician() {
		return housePhysician;
	}

	public void setHousePhysician(Physician housePhysician) {
		this.housePhysician = housePhysician;
	}

	public void attendWedding() {
		numberOfWeddingAttended++;
	}

	@Override
	public String toString() {
		return "Family [numberOfFamilyMembers=" + numberOfFamilyMembers + ", typeOfFamily=" + typeOfFamily
				+ ", familySurname=" + familySurname + ", housePhysician=" + housePhysician
				+ ", getNumberOfWeddingAttended()=" + getNumberOfWeddingAttended() + "]";
	}
	
	


}

/*
 * Name: A.K.M.RAKIBUL HASSAN BISWAS. ID: 2014148042.
 * 
 * 
 */