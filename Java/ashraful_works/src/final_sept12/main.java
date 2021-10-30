package final_sept12;

public class main {
	
	public static void main(String[] args) throws Exception {
		
		Faculty f1 = new Faculty();
		f1.setAge(12);
		f1.setId(1231);
		f1.setMonthlySalary(3000);
		f1.setYearlyBonus(40000);
		
		System.out.println(f1);
		System.out.println(f1.yearlyIncome());
		System.out.println(f1.yearlyIncomeTax());
		System.out.println(f1.yearlysalaryTax());
		
		
	}

}
