import java.util.ArrayList;

public class Manager extends SalariedEmployee
{
    // instance variable
    private double weeklyBonus;
    
    // constructor
    public Manager(String id, String first, String last, String birth, String hired, double accumVacationHrs, double ytd, ArrayList<Paycheck> paychecks, double salary, double bonus)
    {
        super(id, first, last, birth, hired, accumVacationHrs, ytd, paychecks, salary);
        
        weeklyBonus = bonus;
    }
    
    // overloaded constructor
    public Manager(String id, String first, String last, String birth, String hired, double salary, double bonus)
    {
        super(id, first, last, birth, hired, salary);
        
        weeklyBonus = bonus;
    }
    
    // getter method
    public double getWeeklyBonus()
    {
        return weeklyBonus;
    }
    
    // setter method
    public void setWeeklyBonus(double bonus)
    {
        weeklyBonus = bonus;  
    }
    
    public double getBonusAfterTax()
    {
        return weeklyBonus - (weeklyBonus * PayrollUtility.BONUS_TAX_RATE);
        
        /* Could also be written as follows: */
        /*
        return weeklyBonus * ( 1 -  PayrollUtility.BONUS_TAX_RATE);
        */
    }
    
    @Override
    public String toString()
    {
        return  super.toString() +
                String.format("%-27s%s\n","Weekly Bonus:", PayrollUtility.convertToCurrencyStringLeftAligned(weeklyBonus) );
    }
}
