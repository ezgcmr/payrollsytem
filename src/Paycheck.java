
public class Paycheck {
	private String employeeID;
	private String periodBeginDate;
    private String periodEndDate;
    private String payDate;
    private double grossAmount;
    private double taxAmount;
    private double bonusAmount;
    private double netAmount;
    
	public Paycheck(String employeeID, String periodBeginDate,
			String periodEndDate, String payDate, double grossAmount,
			double taxAmount, double bonusAmount, double netAmount) {
		super();
		this.employeeID = employeeID;
		this.periodBeginDate = periodBeginDate;
		this.periodEndDate = periodEndDate;
		this.payDate = payDate;
		this.grossAmount = grossAmount;
		this.taxAmount = taxAmount;
		this.bonusAmount = bonusAmount;
		this.netAmount = netAmount;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getPeriodBeginDate() {
		return periodBeginDate;
	}

	public void setPeriodBeginDate(String periodBeginDate) {
		this.periodBeginDate = periodBeginDate;
	}

	public String getPeriodEndDate() {
		return periodEndDate;
	}

	public void setPeriodEndDate(String periodEndDate) {
		this.periodEndDate = periodEndDate;
	}

	public String getPayDate() {
		return payDate;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public double getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(double grossAmount) {
		this.grossAmount = grossAmount;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public double getBonusAmount() {
		return bonusAmount;
	}

	public void setBonusAmount(double bonusAmount) {
		this.bonusAmount = bonusAmount;
	}

	public double getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(double netAmount) {
		this.netAmount = netAmount;
	}

	@Override
	public String toString() {
		return "Paycheck [employeeID=" + employeeID + ", periodBeginDate="
				+ periodBeginDate + ", periodEndDate=" + periodEndDate
				+ ", payDate=" + payDate + ", grossAmount=" + grossAmount
				+ ", taxAmount=" + taxAmount + ", bonusAmount=" + bonusAmount
				+ ", netAmount=" + netAmount + "]";
	}
    
}
