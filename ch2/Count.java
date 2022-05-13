import java.util.*;
class Count
{
	public static void main(String args[])
	{
		int n,d,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		n=sc.nextInt();
		while(n!=0)
		{
			d=n%10;
			n=n/10;
                        count++;
		}
		System.out.println("Number of digits in given number="+count);
	}
}