import java.util.Scanner;
class Base
{
    	public int display(int i)
    	{
 		return i+6;
    	}
}
class Derived extends Base
{
    	public double display(double i)
    	{
       		 return i + 4.98;
    	}
}
class Ch6P17
{
    	public static void main(String args[])
    	{
        	int a;
		float b;
		Derived obj = new Derived();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		a=sc.nextInt();
		System.out.println("Value after adding 6 to entered number is : "+obj.display(a));
        	System.out.println("Enter a fractional number : ");
		b=sc.nextFloat();
		System.out.println("Value after adding 4.98 to entered number is : "+obj.display(b));
    	}
}