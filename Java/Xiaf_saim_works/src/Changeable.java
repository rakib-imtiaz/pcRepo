
public interface Changeable {
	
	//this method is correct
	void changeY();
	
	//this method is also correct
	public void changeX();

	//this method gives use error
//	private  void changeZ();

}
/*
 * so we can prove that the method decalared in the
 * in the interface are by default public
 * 
 * */
 