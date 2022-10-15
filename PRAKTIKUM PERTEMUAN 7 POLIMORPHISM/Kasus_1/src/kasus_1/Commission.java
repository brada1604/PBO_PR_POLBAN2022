package kasus_1;

public class Commission extends Hourly {
	double totalSales2, commissionRate, payment; 

	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.commissionRate = commissionRate;
		// TODO Auto-generated constructor stub
	}

	public void addSales (double totalSales){
		totalSales2 += totalSales;
	}

	@Override
	public double pay()
	{
		double payment = super.pay() + totalSales2 * commissionRate / 100;
		totalSales2 = 0;
		return payment;
	}

	@Override
	public String toString()
	{
		String result = super.toString ();
		result += "\nTotal Sales: " + totalSales2;
		return result;
	}
}
