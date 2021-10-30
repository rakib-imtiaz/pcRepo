package new_work;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReservedClass {
	private String fullName;
	private String facultyInitial;
	private int numberOfStudents;
	private String facultyId;
	private String roomNumber;
	private String timeslot;
	private String date;

	public String getFullName() {
		return fullName;
	}

	public ReservedClass(String fullName, String facultyInitial, int numberOfStudents, String facultyId,
			String roomNumber, String timeslot, String date) throws Exception {
		super();
		setDate(date);
		setFacultyId(facultyId);
		setFacultyInitial(facultyInitial);
		setFullName(fullName);
		setNumberOfStudents(numberOfStudents);
		setRoomNumber(roomNumber);
		setTimeslot(timeslot);
	}

	@Override
	public String toString() {
		return "ReservedClass [fullName=" + fullName + ", facultyInitial=" + facultyInitial + ", numberOfStudents="
				+ numberOfStudents + ", facultyId=" + facultyId + ", roomNumber=" + roomNumber + ", timeslot="
				+ timeslot + ", date=" + date + "]";
	}

	public void setFullName(String fullName) throws Exception {

		if (fullName.length() < 3) {
			throw new Exception("Name Must be  Greater than 3 characters");
		} else {
			this.fullName = fullName;

		}

	}

	public String getFacultyInitial() {
		return facultyInitial;
	}

	public void setFacultyInitial(String facultyInitial) throws Exception {

		Pattern my_pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher my_match = my_pattern.matcher(facultyInitial);
		boolean check = my_match.find();
		if (check)
			throw new Exception("Faculty id cant contain special character\n");
		else
			this.facultyInitial = facultyInitial;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) throws Exception {
		try {
			this.numberOfStudents = numberOfStudents;
		} catch (Exception e) {
			throw new Exception("Cant contain Letter");
		}
	}

	public String getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(String facultyId) throws Exception {
		Pattern my_pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher my_match = my_pattern.matcher(facultyId);
		boolean check = my_match.find();
		if (check)
			throw new Exception("Faculty id cant contain special character\n");
		else
			this.facultyId = facultyId;
	}

	public String getRoomNumber() {

		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) throws Exception {

	}

	public String getTimeslot() {
		return timeslot;
	}

	public void setTimeslot(String timeslot) throws Exception {

		if (!(timeslot.contains(":"))) {
			throw new Exception("Invalid timeslot Format.FORMAT is (HOUR:MIN PM/AM");

		}

		else {
			this.timeslot = timeslot;
		}
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) throws Exception {

		if (!(date.contains("/"))) {
			throw new Exception("Invalid Date Format.FORMAT is (dd/mm/yyyy");

		} else {
			this.date = date;

		}

	}

}
