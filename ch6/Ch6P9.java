import java.util.*;
 class Shape
{
	protected float rad,vol;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		rad=sc.nextFloat();
	}
	final public void display()
	{
		System.out.println("Radius="+rad+"\nVolume="+vol);
	}
}
class Sphere extends Shape
{
	public void calc()
	{
		vol=4*3.14f*rad*rad*rad/3;
	}
}
class Hemisphere extends Shape
{
	public void calc()
	{
		vol=2*3.14f*rad*rad*rad/3;
	}
}
public class Ch6P9
{
	public static void main(String args[])
	{
		Sphere s=new Sphere();
		s.accept();
		s.calc();
		s.display();
		Hemisphere s1=new Hemisphere();
		s1.accept();
		s1.calc();
		s1.display();
	}
}