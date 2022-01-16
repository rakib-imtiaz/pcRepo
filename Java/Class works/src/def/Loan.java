package def;
public class Loan {
	int salary;
	int balance;
	int limit;
	
	Loan(int sal, int baln, int lim)
	{
		salary =sal;
		balance =baln;
		limit = lim;
	}
	
	public boolean ifEligible()
	{
		if(salary>50000 && balance>80000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int amountGranted()
	{
		if(ifEligible()==true)
		{
			if(salary>200000)
			{
				limit = 1000000;
				return limit;
			}
			else if(salary>100000)
			{
				limit = 700000;
				return limit;
			}
			else
			{
				limit = 50000;
				return limit;
			}
		}
		limit =30000;
		return limit;
	}
	
	

}