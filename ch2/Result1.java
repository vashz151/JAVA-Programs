import java.util.*;
public class Result1
{
	public static void main(String args[])
	{
		int marks;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter marks out of 100:");
		marks=sc.nextInt();
		if(marks==100) System.out.println("Distinction");
		else
		switch(marks/10)
		{
			case 9:
			case 8:
			case 7:System.out.print("Distinction");
			break;
			case 6:System.out.print("First Class");
			break;
			case 5:System.out.print("Second class");
			break;
			case 4:System.out.println("Pass Class");
			break;
			case 3:
			case 2:
			case 1:
			case 0:if(marks>=0) System.out.print("Fail");
			else System.out.println("Invalid Marks");
			break;
			default:System.out.print("Invalid marks");
		}
	}
}