import java.util.ArrayList;


public class Manager extends SalariedEmployee {
	private double weeklyBonus;

	public Manager(String employeeID, String firstName, String lastName,
			String dateOfBirth, String dateHired, double accruedVacationHours,
			double yearToDate, ArrayList<Paycheck> listOfPaychecks,
			double annualSalary, double weeklyBonus) {
		super(employeeID, firstName, lastName, dateOfBirth, dateHired,
				accruedVacationHours, yearToDate, listOfPaychecks, annualSalary);
		this.weeklyBonus = weeklyBonus;
	}

	public Manager(String employeeID, String firstName, String lastName,
			String dateOfBirth, String dateHired, double annualSalary,
			double weeklyBonus) {
		super(employeeID, firstName, lastName, dateOfBirth, dateHired,
				annualSalary);
		this.weeklyBonus = weeklyBonus;
	}

	public double getWeeklyBonus() {
		return weeklyBonus;
	}

	public void setWeeklyBonus(double weeklyBonus) {
		this.weeklyBonus = weeklyBonus;
	}
	
	public void getBonusAfterTax(){
        weeklyBonus = PayrollUtility.BONUS_TAX_RATE;
    }

	@Override
	public String toString() {
		return super.toString() + "Manager [weeklyBonus=" + weeklyBonus + "]";
	}

}
