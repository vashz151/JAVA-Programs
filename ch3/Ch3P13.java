import java.util.*;
public class Ch3P13
{
	public static void main(String args[])
	{
		int i,n,m,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns:");
		m=sc.nextInt();
		n=sc.nextInt();
		int x[][]=new int[m][n];
		for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=n-1;j++)
			{
				System.out.print("Enter a value:");
				x[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entered matrix is:");
		for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=n-1;j++)
			{
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
	}
}