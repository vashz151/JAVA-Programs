import java.util.*;
public class Ch4P5
{
	int fact (int x)
	{
		if(x==0) return 1;
		return (x * fact(x-1));
	}
	public static void main(String args[])
	{
		int n,facto;
		Scanner sc=new Scanner(System.in);
		Ch4P5 obj1=new Ch4P5();
		System.out.println("Enter a number:");
		n=sc.nextInt();
		facto=obj1.fact(n);
		System.out.println("Factorial="+facto);
	}
}