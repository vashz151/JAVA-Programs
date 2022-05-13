import java.util.*;
class Pattern7
{
	public static void main(String args[])	
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++)
			{	
				System.out.print("*");	
			}	
			System.out.println();
		}
		for(i=n-1;i>=1;i--)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++)
			{	
				System.out.print("*");	
			}	
			System.out.println();
		}
	}
}