
public class main{
	
	public static void main(String[] args) {
		
		int x=40;
		int y=20;
		
		Modifier.change(x,y);
		x=Modifier.getX();
		y=Modifier.gety();
		
		System.out.println(x +" " +y);
		
	}
}
class Modifier {
  int x;
  int y;
 
	public  void change(int x, int y){
        x = x - 10;
        y = y + 10;
        
        setX(x);
        setY(y);
       
        
    }
	
	public  void setX(int x) {
		x = x;
	}
	public   void setY(int y) {
		y = y;
	}
	 int  getX()
    {
    	return x;
    }
	 int  gety()
    {
    	return y;
    }
}