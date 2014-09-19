import java.util.*;

public class Employee {
	//private instance variables
		private String employeeID;
		private String firstName;
		private String lastName;
		private String dateOfBirth;
		private String dateHired;
		private double accruedVacationHours;
		private double yearToDate;
		private ArrayList<Paycheck> listOfPaychecks;
			
	public Employee(String employeeID, String firstName, String lastName,
				String dateOfBirth, String dateHired,
				double accruedVacationHours, double yearToDate,
				ArrayList<Paycheck> listOfPaychecks) {
			super();
			this.employeeID = employeeID;
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
			this.dateHired = dateHired;
			this.accruedVacationHours = accruedVacationHours;
			this.yearToDate = yearToDate;
			this.listOfPaychecks = listOfPaychecks;
		}

		public String getEmployeeID() {
			return employeeID;
		}
		public void setEmployeeID(String employeeID) {
			this.employeeID = employeeID;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getDateHired() {
			return dateHired;
		}
		public void setDateHired(String dateHired) {
			this.dateHired = dateHired;
		}
		public double getAccruedVacationHours() {
			return accruedVacationHours;
		}
		public void setAccruedVacationHours(double accruedVacationHours) {
			this.accruedVacationHours = accruedVacationHours;
		}
		public double getYearToDate() {
			return yearToDate;
		}
		public void setYearToDate(double yearToDate) {
			this.yearToDate = yearToDate;
		}
		public ArrayList<Paycheck> getListOfPaychecks() {
			return listOfPaychecks;
		}

		public void setListOfPaychecks(ArrayList<Paycheck> listOfPaychecks) {
			this.listOfPaychecks = listOfPaychecks;
		}

		@Override
		public String toString() {
			return "Employee [employeeID=" + employeeID + ", firstName="
					+ firstName + ", lastName=" + lastName + ", dateOfBirth="
					+ dateOfBirth + ", dateHired=" + dateHired
					+ ", accruedVacationHours=" + accruedVacationHours
					+ ", yearToDate=" + yearToDate + "]";
		}
		
	    public void addPaycheck(Paycheck check){
	    	listOfPaychecks.add(check);
	    }

	    public double calculateGrossAmount(){
	        return 0;
	    }

	    public double calculateTaxDeduction(){
	        return 0;
	    }

	    public double calculateVactionHours(){
	        return 0;
	    }
		
}
