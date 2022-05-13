import java.util.*;
public class Ch4P1A
{
	int add (int x,int y)
	{
		return (x+y);
	}
	public static void main(String args[])
	{
		int sum,a,b;
		Scanner sc=new Scanner(System.in);
		Ch4P1A obj1=new Ch4P1A();
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=obj1.add(a,b);
		System.out.println("Sum="+sum);
	}
}