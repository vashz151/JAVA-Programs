import java.util.*;
class Pattern11
{
	public static void main(String args[])	
	{
		int i,j,n,k=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print((char)('A'-1+k++) + " ");
			}
			System.out.println();
		}
	}
}