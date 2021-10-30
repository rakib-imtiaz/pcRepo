
public class GradedQuiz  extends Quiz implements Gradable{

	@Override
	public void howtoGrade(int p) {
		
		System.out.println("The quiz will carry "+p);		
	}

}
