import java.util.*;
public class Test5
{
	public static void main(String args[])
	{
		int i,m,j,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows or columns:");
		m=sc.nextInt();
		int a[][]=new int[m][m];
		for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=m-1;j++)
			{
				System.out.print("Enter a value:");
				a[i][j]=sc.nextInt();
			}
		}
                System.out.println("Original Matrix:");
                for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=m-1;j++)
			{
				System.out.print(+a[i][j]+"\t");
			}
                        System.out.println();
		}
		for(i=0;i<=m-1;i++)
		{
			sum+=a[i][i];
		}
		System.out.println("Sum of diagonal elements="+sum);
	}
}