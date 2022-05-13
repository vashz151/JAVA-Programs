import java.util.*;
public class Ch4P9
{
	static int digit (int n)
	{
		int d;
                d=n%10;
                if(n==0) return 0;
                return(d+ digit(n/10));
	}
	public static void main(String args[])
	{
		int n,sum;
		Scanner sc=new Scanner(System.in);
		Ch4P9 obj1=new Ch4P9();
		System.out.println("Enter a number:");
		n=sc.nextInt();
                sum=digit(n);
                System.out.println("Sum of digits=" +sum);
	}
}