import java.util.*;
class Complex
{
	private int x,y;
	Complex(int a,int b)
	{
		x=a;
		y=b;
	}
	Complex()
	{
	}
	Complex add(Complex n2)
	{
		Complex c=new Complex();
		c.x=x+n2.x;
		c.y=y+n2.y;
		return c;
	}
	void display()	
	{
		System.out.println(x+"+i"+y);
	}
}
class Ch5P12
{
	public static void main(String args[])
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter real and imaginary values of a Complex number:");
		x=sc.nextInt();
		y=sc.nextInt();
		Complex n1=new Complex(x,y);
		System.out.println("Enter real and imaginary values of another Complex number:");
		x=sc.nextInt();
		y=sc.nextInt();
		Complex n2=new Complex(x,y);
		Complex n3=new Complex();
		n3=n1.add(n2);
		n3.display();
	}

}