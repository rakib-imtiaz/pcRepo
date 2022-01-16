
public class Physician {

	/*
	 * Name = Shahnila ID= 1610450042 section = 12 course =cse215 lab phone number
	 * == 01705634679
	 */

	private String highestLevelOfDegree;
	private String typeOfPhysician;
	private String surname;
	private int no_of_familyVisit;
	private int feePerVisit;
	private int totalPayment;

	// constructors without parameter
	Physician() {
	}

	// constructors with parameter
	Physician(String highestLevelOfDegree, String typeOfPhysician, String surname, int visitno, int feePerVisit,
			int totalpayment) {
		this.highestLevelOfDegree = highestLevelOfDegree;
		this.typeOfPhysician = typeOfPhysician;
		this.surname = surname;
		no_of_familyVisit = visitno;
		this.feePerVisit = feePerVisit;
		this.totalPayment = totalPayment;

	}

	public String getHighestLevelOfDegree() {
		return highestLevelOfDegree;
	}

	public void setHighestLevelOfDegree(String highestLevelOfDegree) {
		this.highestLevelOfDegree = highestLevelOfDegree;
	}

	public String getTypeOfPhysician() {
		return typeOfPhysician;
	}

	public void setTypeOfPhysician(String typeOfPhysician) {
		this.typeOfPhysician = typeOfPhysician;

	}

	public String getsurname() {
		return surname;
	}

	public void setsurname(String surname) {
		this.surname = surname;
	}

	public int getno_of_familyVisit() {
		return no_of_familyVisit;
	}

	public void setno_of_familyVisit(int no_of_familyVisit) {
		this.no_of_familyVisit = no_of_familyVisit;
	}

	public double getFeePerVisit() {
		return feePerVisit;
	}

	public void setFeePerVisit(int feePerVisit) {
		this.feePerVisit = feePerVisit;
	}

	public double getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(int totalPayment) {
		this.totalPayment = totalPayment;
	}

	void makeDoctorAppointment() {
		no_of_familyVisit++;
	}

	void cancelDoctorAppointment() {
		no_of_familyVisit--;
	}

	void determineExpericeneOFPhysician() {
		if (no_of_familyVisit == 0) {
			System.out.println("intern doctor");
		} else if (no_of_familyVisit < 1000) {
			System.out.println("just passed a novice doctor , with a very little experience");
		} else if (1000 < no_of_familyVisit && no_of_familyVisit < 10000) {
			System.out.println("has a mediocre level of experience ");
		}

		else if (no_of_familyVisit > 30000) {
			System.out.println("has a decent level of experience  ");
		} else {
			System.out.println("doesnot like to go home of patiens");
		}

	}

	@Override
	public String toString() {
		return "surname--" + surname + "     " + " highestLevelOfDegree--" + highestLevelOfDegree + "   "
				+ "typeOfPhysician--" + typeOfPhysician + "   " + "numberOfVisitToTheFamily---" + no_of_familyVisit
				+ "     " + "feePerVisit--" + feePerVisit + "   " + " totalPayment--" + totalPayment;
	}

	
}
