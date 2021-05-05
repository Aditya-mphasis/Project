
public class SavingsAccount {
	private double bankBalance = 80000;
	
	public SavingsAccount(double bankBalance) {
		super();
		this.bankBalance = bankBalance;
	}

	void withdraw(double amountToWithdraw)
	{
		bankBalance = bankBalance - amountToWithdraw;
		//bankBalance = bankBalance - 20;
	}
	
	public double getBankBalance()
	{
		return bankBalance;
	}
}
