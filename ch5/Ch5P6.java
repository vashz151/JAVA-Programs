import java.util.*;
class Euclid
{
	private int n1,n2;
	public Euclid(int x,int y)
	{
		n1=x;
		n2=y;
	}
	public int calculate(int x,int y)
	{
		if(y==0) return x;
		return(calculate(y,x%y));
	}
	public void display()
	{
		int gcd=calculate(n1,n2);
		if(gcd==1) System.out.println("GCD doesn't exist");
		else System.out.println("GCD="+gcd);
	}
}
public class Ch5P6
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		Euclid c=new Euclid(a,b);
		c.display();
	}
}