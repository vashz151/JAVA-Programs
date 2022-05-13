import java.util.*;
public class Ch4P7
{
	int pow (int x,int n)
	{
		if(n==0) return 1;
		return (x * pow(x,n-1));
	}
	public static void main(String args[])
	{
		int x,n,ans;
		Scanner sc=new Scanner(System.in);
		Ch4P7 obj1=new Ch4P7();
		System.out.println("Enter value of x and n:");
		x=sc.nextInt();
                n=sc.nextInt();
		ans=obj1.pow(x,n);
		System.out.println("Value of y="+ans);
	}
}