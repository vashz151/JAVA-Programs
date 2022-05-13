import java.util.*;
class Fibo
{
	public static void main(String args[])
	{
		int i,n,a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		n=sc.nextInt();
		System.out.println("Fibonacci Series:\n0n1");
		for(i=1;i<=n-2;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}
}