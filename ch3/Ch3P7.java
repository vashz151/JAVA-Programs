import java.util.*;
public class Ch3P7
{
	public static void main(String args[])
	{
		int i,n,small;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		int x[]=new int[n];
		for(i=0;i<=n-1;i++)
		{
			System.out.println("Enter a value:");
			x[i]=sc.nextInt();
		}
		small=x[0];
		for(i=1;i<=n-1;i++)
		{
			if(x[i]<small) small=x[i];
		}
		System.out.println("Smallest number="+small);
	}
}