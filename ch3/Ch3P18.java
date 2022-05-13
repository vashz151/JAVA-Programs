import java.util.*;
public class Ch3P18
{
	public static void main(String args[])
	{
		int i,m,j,n,p,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Matrix 1:");
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
		System.out.println("Matrix 2:");
		System.out.println("Enter the number of columns:");
		p=sc.nextInt();
		int y[][]=new int[n][p];
		int z[][]=new int[m][p];
		for(i=0;i<=n-1;i++)
		{
			for(j=0;j<=p-1;j++)
			{
				System.out.print("Enter a value:");
				y[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=p-1;j++)
			{
				z[i][j]=0;
				for(k=0;k<=n-1;k++)
				{
					z[i][j]=z[i][j]+x[i][k]*y[k][j];
				}
			}
		}
		System.out.println("Product matrix is:");
		for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=p-1;j++)
			{
				System.out.print(z[i][j]+"\t");
			}
			System.out.println();
		}
	}
}