//Write a program to calculate the simple interest taking the principal amount, rate of interest
//and number of years from user
import java.util.Scanner;
class SimpleInterest
{
	public static void main(String args[])
	{
		float p,n,r,si;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter principal amount, number of years and rate of interest:");
		p=sc.nextFloat();
		n=sc.nextFloat();
		r=sc.nextFloat();
		si=p*n*r/100;
		System.out.println("Simple Interest="+si);
	}
}