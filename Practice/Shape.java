import java.util.*;
public class Shape
{
	void Area(float l)
	{
		System.out.println("Area of Square="+(l*l));
	}
	void Area(float l,float b)
	{
		System.out.println("Area of Rectangle="+(l*b));
	}
	public static void main(String args[])
	{
        float l,b,h;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length:");
        l=sc.nextFloat();
        System.out.println("Enter breadth:");
        b=sc.nextFloat();
        Shape s=new Shape();
        s.Area(l);
        s.Area(l,b);
	}
}