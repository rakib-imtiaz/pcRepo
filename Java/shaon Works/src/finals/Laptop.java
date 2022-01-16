package finals;

public class Laptop extends MyDevice {
    
    
    private String eMail;

    public Laptop() {
    }

    public Laptop(double price,String eMail) {
        super(networks, price);
        this.eMail = eMail;
    }

    

    @Override
    public String toString() {
        return super.toString()+"Laptop{" + "eMail=" + eMail + '}';
    }

	@Override
	public void portable() {
		// TODO Auto-generated method stub
		
	}
    
    
    
}