import java.util.*;
class NaturalSum
{
	public static void main(String args[])
	{
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			 sum+=i;
		}
           System.out.println("Sum of first "+n+" natuaral numbers="+sum);
	}
}
