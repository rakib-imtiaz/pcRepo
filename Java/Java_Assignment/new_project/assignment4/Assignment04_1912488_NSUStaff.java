package assignment4;

public class Assignment04_1912488_NSUStaff extends Assignment04_1912488_Person implements Assignment04_1912488_Student,Assignment04_1912488_Teacher {

	@Override
	public String teacherId() {
		return "ID: NsuStaffTeacher"+super.getNID();
	}

	@Override
	public String studentID() {
		return"ID: NsuStaffStudent"+super.getNID();
	}

	

}