package xsdsdsd.new_project.assignment4;

public class Assignment04_1912488_Runner {

	public static void main(String[] args) {
		/// NSUer
		Assignment04_1912488_NSUer nsuer = new Assignment04_1912488_NSUer();
		nsuer.setFullName("sadia");
		nsuer.setNID("12345678");
		nsuer.setDateOfBirth("12/12/1990");
		nsuer.studentID();
		System.out.println();
		System.out.println(nsuer);
		System.out.println(nsuer.studentID());
		System.out.println();

		// NSU teacher
		Assignment04_1912488_NSUTeachers teacher = new Assignment04_1912488_NSUTeachers();

		teacher.setFullName("Ahmed jaman");
		teacher.setNID("34145678");
		teacher.setDateOfBirth("12/12/1980");
		System.out.println(teacher);
		System.out.println(teacher.teacherId());
		System.out.println();

		// nsu staff as teacher

		Assignment04_1912488_NSUStaff staff = new Assignment04_1912488_NSUStaff();
		staff.setFullName("Nandan Roy");
		staff.setNID("45567785");
		staff.setDateOfBirth("31/2/1997");
		System.out.println(staff);
		System.out.println(staff.studentID());
		System.out.println();

		// nsu staff as student

		Assignment04_1912488_NSUStaff staff2 = new Assignment04_1912488_NSUStaff();
		staff2.setFullName("Snigdha Islam");
		staff2.setNID("3445567785");
		staff2.setDateOfBirth("23/7/1995");

		System.out.println(staff2);
		System.out.println(staff2.teacherId());
		System.out.println();

		// foreign teacher

		Assignment04_1912488_Person p = new Assignment04_1912488_NSUTeachers();
		p.setFullName(" Adiba chowdhury");
		p.setNID("9876534485");
		p.setDateOfBirth("13/10/1996");
		System.out.println(p);
		System.out.println("ID: ForeignNsuTeacher"+p.getNID());
	}

}
