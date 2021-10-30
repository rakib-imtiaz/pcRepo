
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		Residents res = new Residents("kazi", "12131313133", 1200);
		res.makeList();
		

	}

}

interface Validate {

	public boolean validateNid();

}

class Residents implements Validate {
	private String name;
	private String nid;
	private double salary;

	public Residents(String name, String nid, double salary) {
		super();
		this.name = name;
		this.nid = nid;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Residents [name=" + name + ", nid=" + nid + ", salary=" + salary + "]";
	}

	public void makeList() throws IOException {
		File file = new File("residents.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		
		ArrayList<Residents> reslIts = new ArrayList<Residents>();

		while (reader != null) {
			String nid= reader.readLine();
			char[] nidconv=nid.toCharArray();
			Residents a = new Residents(nidconv[0],nidconv[1],Integer.parseInt(nidconv[2]));
			if(a.ge)
			reslIts.add(a);

		}
	}

	@Override
	public boolean validateNid() {
		if (nid.length() > 17) {
			return true;
		} else {
			return false;
		}

	}

}
