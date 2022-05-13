import java.util.*;
class Pattern12
{
	public static void main(String args[])	
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=i%2;j<=i;j++)
			{
				System.out.print(j%2+"   ");
				if(i%2==0 && j==i-1) break;
			}
			System.out.println();
		}
	}
}