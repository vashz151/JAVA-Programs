import java.util.*;
class Student
{
	private int ID,P,C,M,total;
	private String name;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name, ID, and marks in 3 subjects:");
		name=sc.nextLine();
		ID=sc.nextInt();
		P=sc.nextInt();
		C=sc.nextInt();
		M=sc.nextInt();
		total=P+C+M;
	}
	public boolean compare(Student s)
	{
		if(total<s.total) return true;
		else return false;
	}
	public void display()
	{
		System.out.println(name+"\t"+ID+"\t"+P+"\t"+C+"\t"+M+"\t"+total);
	}
}
public class Ch5P17
{
	public static void main(String args[])
	{
		int i,n,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		n=sc.nextInt();
		Student c[]=new Student[n];
		Student temp=new Student();
		for(i=0;i<=n-1;i++)
		{
			c[i]=new Student();
			c[i].accept();
		}
		for(i=0;i<=n-2;i++)
		{
			for(j=0;j<=n-2;j++)
			{
				if(c[j].compare(c[j+1]))
				{
					temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
		System.out.println("Name\tID\tPhy\tChem\tMaths\tTotal");
		for(i=0;i<=n-1;i++)
		{
			c[i].display();
		}
	}
}