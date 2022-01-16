package finals;

class Residents implements Validate{
    private String name;
    private String nid;
    private double salary;

    public Residents(String name, String nid, double salary){ //Parameterized constructor
        this.name=name;
        this.nid=nid;
        this.salary=salary;
    }

    public boolean validateNid(){ //Validates the NID
        if (nid.matches("[0-9]+") && nid.length() == 17) 
            return true;
        return false;
    }

    public int getAge(){ //Calculates the age according to the NID
        if (this.validateNid()){
            int year = Integer.parseInt(nid.substring(0,4));
            return (2021-year);
        }
        else return -1;
    }

    public double getSalary(){return this.salary;} //Getter for salary

    public String toString(){ //Helper function for printing the object
        return "Name: " + name + ", NID: " + nid + ", Salary: " + salary + ", Age: " + this.getAge();
    }
}