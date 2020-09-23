import java.util.Scanner;

class Details
{
	private String SurName;
	private String LastName;
	private int CustomerId;
	private int Deposit = 0;
	private int Deposit1;
	private int previoustransaction;
	private int Balance = 0;
	private char option;
	public void Details()
	{
		this.SurName = SurName;
		this.LastName = LastName;
		this.CustomerId = CustomerId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Surname of the customer: ");
		SurName = sc.next();
		System.out.println("Enter the Lastname of the customer: ");
		LastName = sc.next();
		StringBuffer sb = new StringBuffer();
		sb.append(SurName);
		sb.append(LastName);
		System.out.println("Customer Name: "+sb);
		System.out.println("Enter the CustomerId: ");
		CustomerId = sc.nextInt();
		System.out.println("Customer Id: "+CustomerId);
	}
	void Deposit(int amount)
	{
		if(amount != 0)
		{
			Balance = Balance + amount;
			previoustransaction = amount;
		}
	}
	void Withdraw(int amount)
	{
		if(amount != 0)
		{
		Balance = Balance - amount;
		previoustransaction = -amount;
	    }
	}
	void getprevioustransaction()
	{
		if(previoustransaction > 0)
		{
			System.out.println("Deposited = "+previoustransaction);
		}
		else if (previoustransaction < 0 )
		{
		System.out.println("Withdraw = "+Math.abs(previoustransaction));
		}
		else
		{
			System.out.println("NO transaction occur");		
		}
	}
	void showmenu()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("A.Check Balance");
		System.out.println("B.Deposit");
		System.out.println("C.Withdraw");
	    System.out.println("D.Previous Transaction");
	    System.out.println("Exit");
	    
	    do
	    {
	    	char option = '\0';
	    	System.out.println("*******************");
	    	System.out.println("Enter an option: ");
	    	 option = sc.next().charAt(0);
	    	System.out.println("***************");
	    	switch(option)
	    		{
	    		case 'A':
	    			System.out.println("Balance = "+Balance);
	    			break ; 
	    		case 'B':
	    			System.out.println("Enter an amount deposit = ");
	    			int amount = sc.nextInt();
	    			Deposit(amount);
	    			break;
	    		case 'C':
	    			System.out.println("Enter the amount Withdraw = ");
	    			int amount2 = sc.nextInt();
	    			Withdraw(amount2);
	    			break;
	    		case 'D':
	    			System.out.println("Previous transaction = ");
	    			getprevioustransaction();
	    			break; 
	    		case 'E':
	    			System.out.println("***********");
	    			break;
	    			default:
	    				System.out.println("Invalid option!");
	    				break;
	    		}
	    }
	    	while(option != 'E');
	    	System.out.println("thank you for using this service");
	    }
	}
public class BankApplication {

	public static void main(String[] args) {
		Details obj = new Details();
		obj.Details();
		obj.showmenu();
	}

}
