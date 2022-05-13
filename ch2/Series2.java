import java.util.*;
class Series2
{
	public static void main(String args[])	
	{
		int i,n,fact=1;
		float sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		for(i=1;i<=n; i++)
		{
			fact=fact*i;
			sum=sum+1.0f/fact;
		}
		System.out.println("Sum="+sum);
	}
}