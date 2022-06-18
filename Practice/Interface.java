import java.util.*;
interface Sports
{
	public void score();
} 
class Student
{
	protected int rollno;
	void accept()
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter roll number of student:");
	    rollno=sc.nextInt();
	}
}
class Test extends Student
{
	protected int sem1_marks,sem2_marks;
	void accept()
	{
	    super.accept();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter sem 1 and sem 2 marks:");
	    sem1_marks=sc.nextInt();
	    sem2_marks=sc.nextInt();
	}
}
class Result extends Test implements Sports
{
	int total,s;
	public void score()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sports marks:");
		s=sc.nextInt();
	}
	public void display()
	{
	    total=sem1_marks+sem2_marks+s;
	    System.out.println("Rollno:"+rollno+"\nSem 1 marks:"+sem1_marks+"\nSem2 marks:"+sem2_marks+"\nSports Marks="+s+"\nTotal marks:"+total);
	}
}
public class Interface
{
	public static void main(String args[])
	{	
		Result r=new Result();
		r.accept();
		r.score();
		r.display();
	}
}
