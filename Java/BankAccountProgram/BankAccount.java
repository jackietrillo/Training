public class BankAccount
{     
	public BankAccount() {   
		this.ownerName = "";
		this.balance = 0.0;
		this.accountId = "";	 
	}

   	public BankAccount(String accountId, String ownerName, double startingBalance) {  
	  this.accountId = accountId;   
      	  this.ownerName = ownerName;
      	this.balance = startingBalance;      
   	}

    	private String ownerName;
   
   	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {

		this.ownerName = ownerName;	
	}
	
	private double balance;
	
	public double getBalance() {

		return this.balance;
	}
	
	public void setBalance(double balance) {
		
		this.balance = balance;	
	}

	private String accountId;
	
	public void setAccountId(String accountId) {

		this.accountId = accountId;
	}
	
	public String getAccountId() {

		return this.accountId;
	}
	 
	public void deposit( double amount ) {
		this.balance += amount;
	}

    public double withdraw( double amount ) {         
		if (this.balance >= amount)
		{
			this.balance -= amount;
			return amount;
		}
		else
		{	
			return 0.0;
		}
	}
}

