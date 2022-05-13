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
	void add(Complex n1, Complex n2)
	{
		x=n1.x+n2.x;
		y=n1.y+n2.y;
	}
	void display()	
	{
		if(y>=0) System.out.println(x+"+i"+y);
		else System.out.println(x+""+y+"i");
	}
}
class Ch5P11
{
	public static void main(String args[])
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter real and imaginary values of a complex number:");
		x=sc.nextInt();
		y=sc.nextInt();
		Complex n1=new Complex(x,y);
		System.out.println("Enter real and imaginary values of another complex number:");
		x=sc.nextInt();
		y=sc.nextInt();
		Complex n2=new Complex(x,y);
		Complex n3=new Complex();
		n3.add(n1,n2);
		n3.display();
	}

}