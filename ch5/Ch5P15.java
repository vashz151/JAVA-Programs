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
	public void display()
	{
		System.out.println(name+"\t"+ID+"\t"+P+"\t"+C+"\t"+M+"\t"+total);
	}
}
public class Ch5P15
{
	public static void main(String args[])
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		n=sc.nextInt();
		Student c[]=new Student[n];
		for(i=0;i<=n-1;i++)
		{
			c[i]=new Student();
			c[i].accept();
		}
		System.out.println("Name\tID\tPhy\tChem\tMaths\tTotal");
		for(i=0;i<=n-1;i++)
		{
			c[i].display();
		}
	}
}