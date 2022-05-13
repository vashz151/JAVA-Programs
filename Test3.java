import java.util.*;
public class Test3
{
	public static void main(String args[])
	{
		int i,n,j,k=0,temp;
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[10][10];
		for(i=0;i<4;i++)
		{
			for(j=0;j<i+1;j++)
			{
			      a[i][j]=k;
                      k++;
                      System.out.print(a[i][j] + " ");	
			}
                 System.out.println();                        

		}
	}
}