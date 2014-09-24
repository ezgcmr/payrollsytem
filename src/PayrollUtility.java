import java.text.NumberFormat;

public class PayrollUtility
{
    public static final int NUMBER_OF_PAY_PERIODS = 52;
    
    public static final double THRESHOLD = 950;
    public static final double TAX_RATE_LESS_THAN_THRESHOLD = .15;
    public static final double TAX_RATE_THRESHOLD_OR_MORE = .20;
       
    public static final double VAC_HOURS_LESS_THAN_THRESHOLD = 2;
    public static final double VAC_HOURS_THRESHOLD_OR_MORE = 3;
    
    public static final double BONUS_TAX_RATE = 0.20;
    
    
    public static String convertToCurrencyString(double value)
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return String.format("%13s%n", fmt.format(value)); 
    }
    
    public static String convertToCurrencyStringLeftAligned(double value)
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return String.format("%s", fmt.format(value)); 
    }
}