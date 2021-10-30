interface W{
	String v="WWWW";
	String methodW();
}
interface X extends W{
	String x="XXXX";
	String methodX();
}
abstract class Y() {
	String y="YYYY";
	abstract String methodY();
}
Class z extends Y implements W,X{
	public String methodW() {
		return x+v;
	}
	public String methodX() {
		return v+x;
	}
	String methodY() {
		return v+x+y;
	}
	
}
public class MainClass{
	public static void main(String[] args) {
		Z z= new Z();
		System.out.println(z.methodW());
		System.out.println(z.methodX());
		System.out.println(z.methodY());
	}
}