package final_sept12;

public class Faculty extends Employee implements TaxCalculator{

	private String initial;
	private int monthlySalary;
	private int yearlyBonus;

	public Faculty() {
		super();
	}

	public Faculty(String initial, int monthlySalary, int yearlyBonus) {
		super();
		this.initial = initial;
		this.monthlySalary = monthlySalary;
		this.yearlyBonus = yearlyBonus;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public int getYearlyBonus() {
		return yearlyBonus;
	}

	public void setYearlyBonus(int yearlyBonus) throws Exception{
		
		if(yearlyBonus<0)
		{
			throw new IllegalArgumentException(yearlyBonus);
		}
		else {
			this.yearlyBonus=yearlyBonus;
		}
			

		
	}

	@Override
	public String toString() {
		return "Faculty [initial=" + initial + ", monthlySalary=" + monthlySalary + ", yearlyBonus=" + yearlyBonus
				+ "]";
	}

	@Override
	public double yearlysalaryTax() {

		double sum = this.yearlysalaryTax();
		sum = sum + sum * TAX_PERCENT;
		return sum;
	}

	@Override
	public double yearlyIncomeTax() {

		double sum = this.yearlyIncomeTax();
		sum = sum + sum * TAX_PERCENT;
		return sum;
	}

	@Override
	public int yearlysalary() {

		return monthlySalary * 12;
	}

	@Override
	public int yearlyIncome() {
		return yearlyBonus + monthlySalary * 12;
	}

}
