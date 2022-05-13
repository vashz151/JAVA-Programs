import java.util.*;
public class Ch3P16
{
	public static void main(String args[])
	{
		int i,m,n,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Matrix 1:");
		System.out.println("Enter the number of rows and columns:");
		m=sc.nextInt();
        n=sc.nextInt();
		int x[][]=new int[m][n];
		int y[][]=new int[n][m];
		for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=n-1;j++)
			{
				System.out.print("Enter a value:");
				x[i][j]=sc.nextInt();
			}
		}
		System.out.println("Original matrix is:");
		for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=n-1;j++)
			{
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
		for(i=0;i<=m-1;i++)
	    {
		    for(j=0;j<=n-1;j++)
		    {
			    y[j][i]=x[i][j];
		    }
	    }
		System.out.println("Transpose matrix is:");
		for(i=0;i<=n-1;i++)
		{
			for(j=0;j<=m-1;j++)
			{
				System.out.print(y[i][j]+"\t");
			}
			System.out.println();
		}
	}
}