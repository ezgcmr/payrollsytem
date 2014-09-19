import java.util.ArrayList;

public class SalariedEmployee extends Employee {
	private double annualSalary;

	public SalariedEmployee(String employeeID, String firstName,
			String lastName, String dateOfBirth, String dateHired,
			double accruedVacationHours, double yearToDate,
			ArrayList<Paycheck> listOfPaychecks, double annualSalary) {
		super(employeeID, firstName, lastName, dateOfBirth, dateHired,
				accruedVacationHours, yearToDate, listOfPaychecks);
		this.annualSalary = annualSalary;
	}

	public SalariedEmployee(String employeeID, String firstName,
			String lastName, String dateOfBirth, String dateHired,
			double annualSalary) {
		super(employeeID, firstName, lastName, dateOfBirth, dateHired);
		this.annualSalary = annualSalary;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	@Override
	public String toString() {
		return super.toString() + "SalariedEmployee [annualSalary=" + annualSalary + "]";
	}
	
	public double calculateGrossAmount(){
		return annualSalary / PayrollUtility.NUMBER_OF_PAY_PERIODS;
	}

	public double calculateTaxDeduction(){
		if (calculateGrossAmount() < PayrollUtility.THRESHOLD){
			return PayrollUtility.TAX_RATE_LESS_THAN_THRESHOLD * calculateGrossAmount();
		} else {
		return PayrollUtility.TAX_RATE_THRESHOLD_OR_MORE * calculateGrossAmount();
		}
	}

	public double calculateVactionHours(){
		if (calculateGrossAmount() < PayrollUtility.THRESHOLD){
			return PayrollUtility.VAC_HOURS_LESS_THAN_THRESHOLD;
		} else {
			return PayrollUtility.VAC_HOURS_THRESHOLD_OR_MORE;
		}
	}	
}
