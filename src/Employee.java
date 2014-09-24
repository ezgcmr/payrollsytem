import java.util.ArrayList;

public class Employee implements Payable
{
    // instance variables
    private String employeeID;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String dateHired;
    private double accruedVacationHours;
    private double yearToDate;
    private ArrayList<Paycheck> listOfPaychecks;
      
    // constructor
    public Employee(String id, String first, String last, String birth, String hired, double vacationHrs, double ytd, ArrayList<Paycheck> paychecks)
    {
        employeeID = id;
        firstName = first;
        lastName = last;
        dateOfBirth = birth;
        dateHired = hired;
        accruedVacationHours = vacationHrs;
        yearToDate = ytd;
        listOfPaychecks = paychecks;
    }
    
    // overloaded constructor
    public Employee(String id, String first, String last, String birth, String hired)
    {
        employeeID = id;
        firstName = first;
        lastName = last;
        dateOfBirth = birth;
        dateHired = hired;
        accruedVacationHours = 0;
        yearToDate = 0;
        listOfPaychecks = new ArrayList<>();
    }
    
    // getter methods
    public String getEmployeeID()
    {
        return employeeID;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    
    public String getDateHired()
    {
        return dateHired;
    }
    
    public double getAccruedVacationHours()
    {
        return accruedVacationHours;
    }
    
    public double getYearToDate()
    {
        return yearToDate;
    }
    
    public ArrayList<Paycheck> getListOfPaychecks()
    {
        return listOfPaychecks;
    }
    
    // setter methods
    public void setEmployeeID(String id)
    {
        employeeID = id;
    }
    
    public void setFirstName(String first)
    {
        firstName = first;
    }
    
    public void setLastName(String last)
    {
        lastName = last;
    }
    
    public void setDateOfBirth(String birth)
    {
        dateOfBirth = birth;
    }
    
    public void setDateHired(String hired)
    {
        dateHired = hired;
    }
    
    public void setAccruedVacationHours(double vacationHrs)
    {
        accruedVacationHours = vacationHrs;
    }
    
    public void setYearToDate(double ytd)
    {
        yearToDate = ytd;
    }
    
    public void setListOfPaychecks(ArrayList<Paycheck> paychecks)
    {
        listOfPaychecks = paychecks;
    }
    
    @Override // method u tekrar yaziyorsun, bunu yazmasanda mainden cagirdigin zaman sana out put verece, bunu commet out yap dene yavrum
    public String toString()
    {
        return  String.format("\n%-27s%s\n", "Employee ID:", employeeID) +
                String.format("%-27s%s\n", "First Name:", firstName) +
                String.format("%-27s%s\n", "Last Name:", lastName) +
                String.format("%-27s%s\n", "Date of Birth:", dateOfBirth) +
                String.format("%-27s%s\n", "Date Hired:", dateHired) +
                String.format("%-27s%s\n", "Accrued Vacation Hours:", accruedVacationHours) +
                String.format("%-27s%s\n", "Amount Paid Year to Date:", PayrollUtility.convertToCurrencyStringLeftAligned(yearToDate)) +
                String.format("%-27s%s\n", "Paychecks Received:", listOfPaychecks);       
    }
    
    public void addPaycheck(Paycheck paycheck)
    {
        //burda arrayin kicina ekliyor diger data yi
        listOfPaychecks.add(paycheck);
    }
    
    @Override
    public double calculateGrossAmount()
    {
        return 0;
    }
    
    @Override
    public double calculateTaxDeduction()
    {
        return 0;
    }
      
    @Override
    public double calculateVacationHours()
    {
        return 0;
    }
}
