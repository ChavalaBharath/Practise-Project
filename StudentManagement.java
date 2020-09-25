import java.util.Scanner;
class Student
{
	private String firstname;
	private String lastname;
	private int gradeyear;
	private static int id = 1000;
	private String courses;
	private int tutionbalance;
	private static int costofcourse = 600;
	private String studentid;
	public Student()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Firstname: ");
		this.firstname = sc.next();
		System.out.println("Enter the last name: ");
		this.lastname = sc.next();
		System.out.println("1.Freshmen\n2.Sophmore\n3.Junior\n4.Senior\nEnter the Student class level: ");
		this.gradeyear = sc.nextInt();
		setstudentid();
		
		System.out.println(this.firstname+" "+this.lastname+" "+gradeyear+""+studentid);
	}
	public void enroll()
	{
		do
		{
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner sc = new Scanner(System.in);
			String course = sc.next();
			if(!course.equals("Q"))
			{
				courses = courses + "\n" +course;
				tutionbalance = tutionbalance + costofcourse;
			}
			else
			{
				System.out.println("Break");
				break;
			}
		}
		while (1!=0);
			System.out.println("Enrolled in : "+courses);
		System.out.println("Tution balance : "+tutionbalance);
	}
	private void setstudentid()
	{
		id++;
		this.studentid = gradeyear+" "+id;
	}
	public void viewbalance()
	{
		System.out.println("YOUR balance: "+tutionbalance);
	}
	public void paytution(int payment)
	{
		tutionbalance = tutionbalance - payment;
		System.out.println("thanks for payment: "+payment);
		viewbalance();
	}
	public String showview()
	{
		return "Nmae: "+firstname + " "+lastname +
				"\nGrade level: "+ gradeyear+
				"\nStudent id: "+studentid+
				"\ncourses Enrolled: "+courses+
				"\nBalance: "+tutionbalance;
	}
}
public class StudentManagement {

	
	public static void main(String[] args) {
		System.out.print("Enter number of new student to enroll : ");
		Scanner sc = new Scanner(System.in);
		int noofstudents = sc.nextInt();
		Student[] students = new Student[noofstudents];
		for(int i = 0; i<noofstudents;i++)
		{
			students[i]= new Student();
			students[i].enroll();
			students[i].paytution(250);
		}
		for(int i = 0;i<noofstudents;i++)
		{
			System.out.println(students[i].showview());
		}
	}
}

