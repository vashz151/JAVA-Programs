import java.util.*;
class Employee
{
	private int empid;
	private float salary;
	private String empname,designation;
	void get_employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name,Designation, Employee id and salary:");
		empname=sc.nextLine();
		designation=sc.nextLine();
		empid=sc.nextInt();
		salary=sc.nextFloat();
	}
	void show_grade()
	{
		if(salary>=100000) System.out.print("\t\tA");
		else if(salary>=50000) System.out.print("\t\tB");
		else System.out.print("\t\tC");
	}
	void show_employee()
	{
		System.out.print(empid+"  "+salary+"\t"+empname+"\t"+designation);
	}
	public static void main(String args[])
	{	
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employees:");
		n=sc.nextInt();
		Employee e[]=new Employee[n];
		Employee temp;
		for(i=0;i<n;i++)
		{
			e[i]=new Employee();
		    e[i].get_employee();
		}
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(e[j].salary<e[j+1].salary)
				{
					temp=e[j];
					e[j]=e[j+1];
					e[j+1]=temp;
				}
			}
		}
		System.out.println("ID Salary\tName    Designation\tGrade");
		for(i=0;i<n;i++)
		{
			e[i].show_employee();
			e[i].show_grade();
			System.out.println();
		}
	}
}