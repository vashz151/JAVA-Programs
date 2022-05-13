import java.util.*;
class Employee
{
	private int empid;
	private float salary;
	private String empname,designation;
	public void get_employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID, Salary, Name and Designation:");
		empid=sc.nextInt();
		salary=sc.nextFloat();
		sc.nextLine();
		empname=sc.nextLine();
		designation=sc.nextLine();
	}
	public void show_grade()
	{
		if(salary>=100000) System.out.println("Grade A Salary Pacakage");
		else if(salary>=50000) System.out.println("Grade B Salary Pacakage");
		else System.out.println("Grade C Salary Pacakage");
	}
	public void show_employee()
	{
		System.out.println("ID:"+empid+"\nSalary:"+salary+"\nName:"+empname+"\nDesignation:"+designation);
	}
}
public class Ch5P3
{
	public static void main(String args[])
	{
		Employee c=new Employee();
		c.get_employee();
		c.show_grade();
		c.show_employee();
	}
}