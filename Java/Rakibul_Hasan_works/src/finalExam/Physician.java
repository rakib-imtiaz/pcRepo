package finalExam;

public class Physician {

	private String surname;
	private String highestLevelOfDegree;
	private String typeOfPhysician;
	private int numberOfVisitToTheFamily = 0;
	private double feePerVisit;
	private double totalPayment = 0;

	public Physician() {
		// TODO Auto-generated constructor stub
	}

	

	public Physician(String surname, String highestLevelOfDegree, String typeOfPhysician, int numberOfVisitToTheFamily,
			double feePerVisit, double totalPayment) {
		super();
		this.surname = surname;
		this.highestLevelOfDegree = highestLevelOfDegree;
		this.typeOfPhysician = typeOfPhysician;
		this.numberOfVisitToTheFamily = numberOfVisitToTheFamily;
		this.feePerVisit = feePerVisit;
		this.totalPayment = totalPayment;
	}



	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	public int getNumberOfVisitToTheFamily() {
		return numberOfVisitToTheFamily;
	}

	public void setNumberOfVisitToTheFamily(int numberOfVisitToTheFamily) {
		this.numberOfVisitToTheFamily = numberOfVisitToTheFamily;
	}

	public double getFeePerVisit() {
		return feePerVisit;
	}

	public void setFeePerVisit(double feePerVisit) {
		this.feePerVisit = feePerVisit;
	}

	public double getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}

	void makeAppointment() {
		numberOfVisitToTheFamily++;
	}

	void cancelAppointment() {
		numberOfVisitToTheFamily--;
	}

	void showExpericeneOFPhysician() {
		if (numberOfVisitToTheFamily < 10) {
			System.out.println("Beginner");
		}
		if (numberOfVisitToTheFamily < 35) {
			System.out.println("Intermediate");
		}
		else if(numberOfVisitToTheFamily > 35  )
		{
			System.out.println("Expert ");
		}

	}



	@Override
	public String toString() {
		return "Physician [surname=" + surname + ", highestLevelOfDegree=" + highestLevelOfDegree + ", typeOfPhysician="
				+ typeOfPhysician + ", numberOfVisitToTheFamily=" + numberOfVisitToTheFamily + ", feePerVisit="
				+ feePerVisit + ", totalPayment=" + totalPayment + "]";
	}
	
	

}





/*
 * Name: A.K.M.RAKIBUL HASSAN BISWAS. ID: 2014148042.
 * 
 * 
 */
