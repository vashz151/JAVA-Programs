import java.util.*;
public class Ch2P49
{
	public static void main(String args[])
	{
		int i,sum=0,n;
		Scanner sc=new Scanner(System.in);
		for(i=1;i<=10;i++)
		{
			System.out.println("Enter a number:");
			n=sc.nextInt();
			if(n>99) break;
			sum=sum+n;
		}
		System.out.println("Sum="+sum);
	}
}