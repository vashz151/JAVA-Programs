import java.util.*;
public class Sum
{
	public static void main(String args[])
	{
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of the series="+sum);
	}
}