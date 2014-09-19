import java.util.ArrayList;

public class HourlyEmployee extends Employee{

    private double hourlyRate;
    private double periodHours;   

    public HourlyEmployee(String employeeID, String firstName, String lastName,
			String dateOfBirth, String dateHired, double accruedVacationHours,
			double yearToDate, ArrayList<Paycheck> listOfPaychecks,
			double hourlyRate, double periodHours) {
		super(employeeID, firstName, lastName, dateOfBirth, dateHired,
				accruedVacationHours, yearToDate, listOfPaychecks);
		this.hourlyRate = hourlyRate;
		this.periodHours = periodHours;
	}

    public HourlyEmployee(String employeeID, String firstName, String lastName,
			String dateOfBirth, String dateHired, double hourlyRate,
			double peroidHours) {
		super(employeeID, firstName, lastName, dateOfBirth, dateHired);
		this.hourlyRate = hourlyRate;
		this.periodHours = peroidHours;
	}

    public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getPeroidHours() {
		return periodHours;
	}

	public void setPeriodHours(double peroidHours) {
		this.periodHours = peroidHours;
	}	

	@Override
	public String toString() {
		return super.toString() + "HourlyEmployee [hourlyRate=" + hourlyRate + ", periodHours="
				+ periodHours + "]";
	}

	public double calculateGrossAmount(double grossAmount){
        grossAmount = hourlyRate * periodHours;
        return grossAmount;
    }

    public double calculateTaxDeduction(double tax){
        if (calculateGrossAmount() < PayrollUtility.THRESHOLD) {
            tax = PayrollUtility.TAX_RATE_LESS_THAN_THRESHOLD;
        } else {
            tax = PayrollUtility.TAX_RATE_THRESHOLD_OR_MORE;
        }
        return tax;
    }

}