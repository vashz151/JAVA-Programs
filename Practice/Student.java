import java.util.*;
class Student
{
	private int p,c,m,total,id;
	private String name;
	void get_Student()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name,Student id and marks in each subject:");
		name=sc.nextLine();
		id=sc.nextInt();
		System.out.print("Enter Marks in Physics:");
		p=sc.nextInt();
		System.out.print("Enter Marks in Chemistry:");
		c=sc.nextInt();
		System.out.print("Enter Marks in Maths:");
		m=sc.nextInt();
		total=p+c+m;
	}
	void show_Student()
	{
		System.out.println(id+"  "+name+"\t"+p+"\t"+c+"\t\t"+m+"\t"+total);
	}
	public static void main(String args[])
	{	
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students:");
		n=sc.nextInt();
		Student s[]=new Student[n];
		Student temp;
		for(i=0;i<n;i++)
		{
			s[i]=new Student();
		    s[i].get_Student();
		}
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(s[j].total<s[j+1].total)
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		System.out.println("ID Name\tPhysics\tChemistry\tMaths\tTotal");
		for(i=0;i<n;i++)
		{
			s[i].show_Student();
		}
	}
}