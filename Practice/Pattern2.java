import java.util.*;
public class Pattern2
{
	public static void main(String args[])
	{
		int i,j,k,n,l=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=n-i;j>=1;j--)
			{
                System.out.print(" "); 
			}
			l=l+i;
			k=l;
			for(j=1;j<=i;j++)
			{
		        System.out.print((char)('A'-1+k--));
			}
			System.out.println();
		}
	}
}