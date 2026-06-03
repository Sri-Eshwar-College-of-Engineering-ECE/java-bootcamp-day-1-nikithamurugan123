public class BankAccount {
	int currentBalance = 10000;
	
	public void deposit()
	{
		int depositAmount = 2000;
		int updatedBalance = currentBalance + depositAmount;
		
		 System.out.println("Current Balance : " + currentBalance);
	     System.out.println("Deposit Amount :"+ depositAmount);
	     System.out.println("Area :"+ updatedBalance);
	}
	public static void main(String[] args) {
		BankAccount bankaccount = new BankAccount();
	       bankaccount.deposit();

	}

}