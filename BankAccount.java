public class BankAccount {
	private String accountholdername;
	private String Bank_name;
	private double Bank_balance;
	
	  public BankAccount(String accountholdername, String Bank_name, double initialbalance) {
		  this.accountholdername = accountholdername;
		  this.Bank_name = Bank_name;
		  this.Bank_balance = initialbalance;
	  }
	      public double getBalance() {
	    	  return Bank_balance;
	      }
	      public void deposit(double amount) {
	    	  if (amount > 0) {
	              Bank_balance += amount;
	              System.out.println(accountholdername + " deposited ₹" + amount + " to " + Bank_name);
	          } else {
	              System.out.println("Invalid deposit amount.");
	          }
	      }
	      
	      public void withdraw(double amount) {
	    	  if (amount >0 && amount <= Bank_balance) {
	    		  Bank_balance -= amount;System.out.println(accountholdername + " withdrew ₹" + amount + " from " + Bank_name);
	          } else {
	              System.out.println("Insufficient balance or invalid withdrawal amount.");
	          }  
	     }
	      public void displayAccount() {
	          System.out.println("\n--- Account Summary ---");
	          System.out.println("Account Holder: " + accountholdername);
	          System.out.println("Bank Name: " + Bank_name);
	          System.out.println("Current Balance: ₹" + Bank_balance);
	      }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount("Naresh", "ICICI", 10000.0);
        BankAccount account2 = new BankAccount("Aman", "HDFC", 15000.0);
        BankAccount account3 = new BankAccount("Priya", "SBI", 20000.0);
        
        account1.deposit(250000);
        account1.withdraw(5000000);
        account1.displayAccount();
        
        account2.deposit(2000);
        account2.withdraw(1500);
        account2.displayAccount();
        
        account3.deposit(2000);
        account3.withdraw(1500);
        account3.displayAccount();

	}

}
