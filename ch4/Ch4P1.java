import java.util.*;
class Ch4P1
{
	static int add (int x,int y)
	{
		return (x+y);
	}
	public static void main(String args[])
	{
		int sum,a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=add(a,b);
		System.out.println("Sum="+sum);
	}
}