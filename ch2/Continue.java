import java.util.*;
public class Continue
{
	public static void main(String args[])
	{
		int i,sum=0,n;
		Scanner sc=new Scanner(System.in);	
		for(i=1;i<=5;i++)
		{
			System.out.println("Enter a number:");
			n=sc.nextInt();
			if(n>=100)
			{
				System.out.println("Number entered is greater than 99");
				i--;
				continue;
			}
			sum=sum+n;
		}
		System.out.println("Sum = "+sum);
	}
}