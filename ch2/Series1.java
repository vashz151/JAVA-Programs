import java.util.*;
class Series1
{
	public static void main(String args[])	
	{
		int i,n;
		float sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		for(i=1;i<=n; i++)
		{
			sum=sum+1.0f/i;
		}
		System.out.println("Sum="+sum);
	}
}