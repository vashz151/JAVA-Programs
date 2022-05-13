import java.util.*;
class Ch4P2
{
	static void add (int x,int y)
	{
		int sum;
                sum=x+y;
		System.out.println("Sum="+sum);
	}
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
                add(a,b);
	}
}