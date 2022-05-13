import java.util.*;
class Result
{
	public static void main(String args[])
	{
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks out of 100:");
		marks=sc.nextInt();
		if(marks>100 || marks<0) 
		System.out.println("Invalid marks");
		else if(marks>=70)
		System.out.println("Distinction");
		else if(marks>=60)
		System.out.println("First Class");
		else if(marks>=50)
		System.out.println("Second Class");
		else if(marks>=40)
		System.out.println("Pass Class");		
		else System.out.println("Fail");
	}
}