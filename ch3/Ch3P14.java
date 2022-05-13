import java.util.*;
public class Ch3P14
{
	public static void main(String args[])
	{
		int i,m,j,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows/columns:");
		m=sc.nextInt();
		int x[][]=new int[m][m];
		for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=m-1;j++)
			{
				System.out.print("Enter a value:");
				x[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<=m-1;i++)
		{
			sum=sum+x[i][i];
		}
		System.out.println("Sum of diagonal elements="+sum);
	}
}