//Write a program to accept a number and display its square
import java.util.Scanner;
class Square
{
	public static void main(String args[])
	{
		int x,sq;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		x=sc.nextInt();
		sq=x*x;
		System.out.println("Square="+sq);
	}
}