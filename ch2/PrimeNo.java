import java.util.*;
class PrimeNo
{
	public static void main(String args[])
	{
		int n,i=2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		n=sc.nextInt();
		while(n%i!=0)
		{
			i++;
		}
		if(n==i)
		System.out.println("It is a prime number");
		else
		System.out.println("It is not a prime number");
	}
}