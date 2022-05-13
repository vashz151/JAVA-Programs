import java.util.*;
class Odd
{
	public static void main(String args[])
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(2*i-1);
		}
		
	}
}