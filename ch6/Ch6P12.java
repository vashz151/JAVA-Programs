import java.util.*;
interface Shape
{
	public void read();
	public void calculate();
	public void display();
}
class Sphere implements Shape
{
	private float radius,volume;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		radius=sc.nextFloat();
	}
	public void calculate()
	{
		volume=4*radius*radius*radius/3*3.14f;
	}
	public void display()
	{
		System.out.println("Volume="+volume);
	}
}
class Hemisphere implements Shape
{
	private float radius,volume;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		radius=sc.nextFloat();
	}
	public void calculate()
	{
		volume=2*radius*radius*radius/3*3.14f;
	}
	public void display()
	{
		System.out.println("Volume="+volume);
	}
}
class Ch6P12
{
    	public static void main(String args[])
    	{
		Sphere s=new Sphere();
		s.read();
		s.calculate();
		s.display();
		Hemisphere s1=new Hemisphere();
		s1.read();
		s1.calculate();
		s1.display();
	}
}