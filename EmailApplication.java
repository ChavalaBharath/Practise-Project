import java.util.Scanner;

class email
{
	private String surname;
	private String lastname;
	private String Department;
	private int defaultrandomlength = 10;
	private String password;
	private String email;
	private String CompanyName = "xyz.com";
	private int mailcapacity = 125;
	private String alternateemail;
	public email(String surname,String lastname)
	{
		this.surname = surname;
		this.lastname = lastname;
		System.out.println("Email Created: "+this.surname+" "+this.lastname);
	//call a method for asking the department -return dep
		this.Department = setdepartment();
		System.out.println("Departmnet: "+this.Department);
		this.password = randompassword(defaultrandomlength);
		System.out.println("Random Password: "+this.password);
		email = surname.toLowerCase()+"."+lastname.toLowerCase()+"@"+this.Department+"."+CompanyName;
		System.out.println("Email: "+email);
	} 
	//ask for the department
	private  String setdepartment()
	{
		System.out.println("Department codes: 1.Sales\n2.Development\n3.Accounting");
		System.out.println("Enter the department choice: ");
		Scanner sc = new Scanner(System.in);
		int depchoice = sc.nextInt();
		if(depchoice == 1)
		return "Sales";
		else if(depchoice  == 2)
		return "Development";
		else if(depchoice == 3)
		return "Accounting";
		else
			return"None";
	}
	private String randompassword(int length)
	{
		String passwordset = "abcdefghijklmnopqrstuvwxyz012345685665565";
		char[] password = new char[length];
		for (int i =0 ; i<length; i++)
		{
			int rand = (int) (Math.random() * passwordset.length());
			password[i]=passwordset.charAt(rand);
		}
		return new String(password); 
		}
	public void setmailcapacity(int capacity)
	{
		this.mailcapacity = capacity;
	}
	public void setalternateemail(String altemail)
	{
		this.alternateemail = altemail;
	}
	public void changepassword(String password)
	{
		this.password = password;
	}
	public int getmailcapacity()
	{
		return mailcapacity;
	}
	public String getalternateemail()
	{
		return alternateemail;
	}
	public String getpassword()
	{
		return password;
	}
}
public class EmailApplication {

	public static void main(String[] args) {
		email e1 = new email("Chavala","Bharath");
		e1.setalternateemail("bharathchawala@gmail.com");
		System.out.println(e1.getalternateemail());
	}
}
