import java.util.*;
public class Ch4P8
{
	int fibo (int i)
	{
		if(i==1) return 0;
		if(i==2) return 1;
		return (fibo(i-1) + fibo(i-2));
	}
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		Ch4P8 obj1=new Ch4P8();
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		System.out.println("Elements are:");
		for(i=1;i<=n;i++)
		{
			System.out.println(obj1.fibo(i));
		}
	}
}