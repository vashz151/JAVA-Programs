import java.util.*;
public class Pattern1
{
	public static void main(String args[])
	{
		int i,j,k,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		for(i=1;i<=n;i+=2)
		{
			for(k=1;k<=i;k++)
			{
                System.out.print(k+" "); 
			}
			System.out.println();
			if(i==n) break;
			for(j=i+1;j>=1;j--)
			{
		        System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}