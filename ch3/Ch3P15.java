import java.util.*;
public class Ch3P15
{
	public static void main(String args[])
	{
		int i,m,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns:");
		m=sc.nextInt();
		n=sc.nextInt();
		int x[][]=new int[m][n];
		int y[][]=new int[m][n];
		int sum[][]=new int[m][n];
		System.out.println("Matrix 1:");
		for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=n-1;j++)
			{
				System.out.print("Enter a value:");
				x[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix 2:");
		for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=n-1;j++)
			{
				System.out.print("Enter a value:");
				y[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=n-1;j++)
			{
				sum[i][j]=x[i][j]+y[i][j];
			}
		}
		System.out.println("Sum matrix is:");
		for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=n-1;j++)
			{
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}
}