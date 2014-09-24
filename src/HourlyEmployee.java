import java.util.*;

public class HourlyEmployee extends Employee
{
    // instance variables
    private double hourlyRate;
    private double periodHours;
        
    // constructor
    public HourlyEmployee(String id, String first, String last, String birth, String hired, double vacationHrs, double ytd, ArrayList<Paycheck> paychecks, double rate, double periodHrs)
    {
        super(id, first, last, birth, hired, vacationHrs, ytd, paychecks);
        
        hourlyRate = rate;
        periodHours = periodHrs;
    }
    
    // overloaded constructor
    public HourlyEmployee(String id, String first, String last, String birth, String hired, double rate, double periodHrs)
    {
        super(id, first, last, birth, hired);
        
        hourlyRate = rate;
        periodHours = periodHrs;
        
    }
    
    // getter methods
    public double getHourlyRate()
    {
        return hourlyRate;
    }
    
    public double getPeriodHours()
    {
        return periodHours;
    }
    
    // setter methods
    public void setHourlyRate(double rate)
    {
        hourlyRate = rate;
    }
    
    public void setPeriodHours(double periodHrs)
    {
        periodHours = periodHrs;
    }
    
    @Override
    public String toString()
    {
        return  super.toString() + 
                String.format("%-27s%s\n", "Hourly Rate:", PayrollUtility.convertToCurrencyStringLeftAligned(hourlyRate) ) +
                String.format("%-27s%s\n", "Period Hours:", periodHours );
    }
    
    @Override
    public double calculateGrossAmount()
    {
        return hourlyRate * periodHours;
    }
    
    @Override
    public double calculateTaxDeduction()
    {
        double taxRate = (calculateGrossAmount() < PayrollUtility.THRESHOLD) ? PayrollUtility.TAX_RATE_LESS_THAN_THRESHOLD : PayrollUtility.TAX_RATE_THRESHOLD_OR_MORE;
        return calculateGrossAmount() * taxRate;
        
        /* Could also be written as follows: */
        /*
        if( calculateGrossAmount() < PayrollUtility.THRESHOLD )
            return calculateGrossAmount() * PayrollUtility.TAX_RATE_LESS_THAN_THRESHOLD;
        else
            return calculateGrossAmount() * PayrollUtility.TAX_RATE_THRESHOLD_OR_MORE;
        */
    }
    
}
