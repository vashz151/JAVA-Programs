import java.util.*;
class Student
{
	private int ID,P,C,M,total;
	private float percent;
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
	}
	public void calculate()
	{
		total=P+C+M;
		percent=total/3.0f;
	}
	public void display()
	{
		System.out.println("ID:"+ID+"\nName:"+name+"\nTotal:"+total+"\nPercent:"+percent);
	}
}
public class Ch5P4
{
	public static void main(String args[])
	{
		Student c=new Student();
		c.accept();
		c.calculate();
		c.display();
	}
}