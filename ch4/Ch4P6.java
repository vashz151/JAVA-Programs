import java.util.*;
public class Ch4P6
{
	int sum (int x)
	{
		if(x==0) return 0;
		return (x + sum(x-1));
	}
	public static void main(String args[])
	{
		int n,sum1;
		Scanner sc=new Scanner(System.in);
		Ch4P6 obj1=new Ch4P6();
		System.out.println("Enter a number:");
		n=sc.nextInt();
		sum1=obj1.sum(n);
		System.out.println("Sum="+sum1);
	}
}