//Write a program to accept two numbers and display their product
import java.util.Scanner;
class Product
{
	public static void main(String args[])
	{
		int x,y,prod;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 2 numbers:");
		x=sc.nextInt();
		y=sc.nextInt();
		prod=x*y;
		System.out.println("Product="+prod);
	}
}