import java.util.*;
public class Ch3P10
{
	public static void main(String args[])
	{
		int i,n,search;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		int x[]=new int[n];
		for(i=0;i<=n-1;i++)
		{
			System.out.println("Enter a value:");
			x[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search:");
		search=sc.nextInt();
		for(i=0;i<=n-1;i++)
		{
			if(search==x[i]) break;
		}
		if(i==n) System.out.println("Not found");
		else System.out.println("Found at position:"+(i+1));
	}
}