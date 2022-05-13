import java.util.*;
class Euclid
{
	private int n1,n2;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		n1=sc.nextInt();
		n2=sc.nextInt();
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
public class Ch5P2
{
	public static void main(String args[])
	{
		Euclid c=new Euclid();
		c.accept();
		c.display();
	}
}