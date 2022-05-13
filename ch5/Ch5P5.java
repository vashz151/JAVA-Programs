import java.util.*;
class Circle
{
	private float rad,area;
	public Circle(float x)
	{
		rad=x;
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
public class Ch5P5
{
	public static void main(String args[])
	{
		float x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		x=sc.nextFloat();		
		Circle c=new Circle(x);
		c.calculate();
		c.display();
	}
}