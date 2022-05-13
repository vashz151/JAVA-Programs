import java.util.*;
public class Ch3P17
{
	public static void main(String args[])
	{
		int i,m,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Matrix 1:");
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
		System.out.println("Original matrix is:");
		for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=m-1;j++)
			{
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
		for(i=0;i<=m-1;i++)
		{
			for(j=i;j<=m-1;j++)
			{
				temp=x[i][j];
				x[i][j]=x[j][i];
				x[j][i]=temp;
			}
		}
		System.out.println("Transpose matrix is:");
		for(i=0;i<=m-1;i++)
		{
			for(j=0;j<=m-1;j++)
			{
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
	}
}