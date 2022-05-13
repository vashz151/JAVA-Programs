import java.util.*;
class Circle
{
	private float rad,area;
	public Circle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		rad=sc.nextFloat();
	}
	public Circle(float x)
	{
		rad=x;
	}
	public Circle(Circle x)
	{
		rad=x.rad*2;
	}
	public void calculate()
	{
		area=3.14f*rad*rad;
	}
	public void display()
	{
		System.out.println("Area of the circle="+area);
	}
}
public class Ch6P14
{
	public static void main(String args[])
	{
		Circle c=new Circle();
		c.calculate();
		c.display();
		Circle c1=new Circle(c);
		c1.calculate();
		c1.display();
		Circle c2=new Circle(25.0f);
		c2.calculate();
		c2.display();
	}
}