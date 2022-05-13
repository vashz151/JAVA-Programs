import java.util.*;
public class Ch4P4
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
		int n,r,nCr,nPr;
		Scanner sc=new Scanner(System.in);
		Ch4P4 obj1=new Ch4P4();
		System.out.println("Enter values of n and r:");
		n=sc.nextInt();
		r=sc.nextInt();
		nCr=obj1.fact(n)/(obj1.fact(r)*obj1.fact(n-r));
		nPr=obj1.fact(n)/(obj1.fact(n-r));
		System.out.println("nCr="+nCr+"\nnPr="+nPr);
	}
}