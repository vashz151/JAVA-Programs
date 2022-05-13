import java.util.*;
public class Ch4P3
{
	int fact (int x)
	{
		int i,f=1;
		for(i=1;i<=x;i++)
		{
			f=f*i;
		}
		return f;
	}
	public static void main(String args[])
	{
		int n,facto;
		Scanner sc=new Scanner(System.in);
		Ch4P3 obj1=new Ch4P3();
		System.out.println("Enter a number:");
		n=sc.nextInt();
		facto=obj1.fact(n);
		System.out.println("Factorial="+facto);
	}
}