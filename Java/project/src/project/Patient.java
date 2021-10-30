package project;

public class Patient {
	
	private int patient_id;
	private boolean isCorona;
	private int age;
	private double oxy_saturation_level;
	private int numberOfObject;
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	
	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public boolean isCorona() {
		return isCorona;
	}

	public void setCorona(boolean isCorona) {
		this.isCorona = isCorona;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getOxy_saturation_level() {
		return oxy_saturation_level;
	}

	public void setOxy_saturation_level(double oxy_saturation_level) {
		this.oxy_saturation_level = oxy_saturation_level;
	}

	public int getNumberOfObject() {
		return numberOfObject;
	}

	public void setNumberOfObject(int numberOfObject) {
		this.numberOfObject = numberOfObject;
	}

	public Patient(int patient_id, boolean isCorona, int age, double oxy_saturation_level, int numberOfObject) {
		super();
		this.patient_id = patient_id;
		this.isCorona = isCorona;
		this.age = age;
		this.oxy_saturation_level = oxy_saturation_level;
		this.numberOfObject = numberOfObject;
	}



	@Override
	public String toString() {
		return "Patient [patient_id=" + patient_id + ", isCorona=" + isCorona + ", age=" + age
				+ ", oxy_saturation_level=" + oxy_saturation_level + ", numberOfObject=" + numberOfObject + "]";
	}
	
	
	
	

}
