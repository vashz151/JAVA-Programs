import java.util.*;
class Circle
{
	private float rad,area;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		rad=sc.nextFloat();
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
public class Ch5P1
{
	public static void main(String args[])
	{
		Circle c=new Circle();
		c.accept();
		c.calculate();
		c.display();
	}
}