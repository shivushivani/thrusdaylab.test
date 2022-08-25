public class SavingsAccount 
{
	private static float annualIntrestRate;
	private float savingsBalance;
	private float monthlyIntrest;

	
	public SavingsAccount(float balance) 
   {
		this.savingsBalance = balance;
	}

	
	public static void modifyInterestRate(float interestRate) 
   {
		annualIntrestRate = interestRate / 100; 
	}


	public void calculateMonthlyInterest() 
   {
		monthlyIntrest = savingsBalance * annualIntrestRate / 12;
		System.out.println("The monthly intrest is: $" + monthlyIntrest);
	}


	private void calculateSavings() {
		savingsBalance += monthlyIntrest;
	}

	
	public void displaySavings() {
		calculateSavings();
		System.out.println("The total balance is : $ " + savingsBalance);
	}

}
