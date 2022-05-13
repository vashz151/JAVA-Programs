import java.util.*;
class SumOfDigits
{
	public static void main(String args[])
	{
		int n,d,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		n=sc.nextInt();
		while(n!=0)
		{
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("Sum="+sum);
	}
}