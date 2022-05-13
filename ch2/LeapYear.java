import java.util.*;
class LeapYear
{
	public static void main(String args[])
	{
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year number:");
		year=sc.nextInt();
		if((year%100!=0 && year%4==0)||(year%400==0)) 
		System.out.println("It is a Leap year");
		else System.out.println("It is not a leap year");
	}
}