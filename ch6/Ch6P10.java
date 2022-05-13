import java.util.*;
abstract class Shape
{
	protected float area;
	public abstract void calc();
	public abstract void accept();
	final public void display()
	{
		System.out.println("Area="+area);
	}
}
class Circle extends Shape
{
	private float rad;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		rad=sc.nextFloat();
	}
	public void calc()
	{
		area=3.14f*rad*rad;
	}
}
class Rectangle extends Shape
{
	private float l,b;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth:");
		l=sc.nextFloat();
		b=sc.nextFloat();
	}
	public void calc()
	{
		area=l*b;
	}
}
class Triangle extends Shape
{
	private float h,b;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and hieght:");
		b=sc.nextFloat();
		h=sc.nextFloat();
	}
	public void calc()
	{
		area=0.5f*h*b;
	}
}
public class Ch6P11
{
	public static void main(String args[])
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Circle\n2.Rectangle\n3.Triangle\nEnter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:Circle s=new Circle();
			s.accept();
			s.calc();
			s.display();
			break;
			case 2:Rectangle s1=new Rectangle();
			s1.accept();
			s1.calc();
			s1.display();
			break;
			case 3:Triangle s11=new Triangle();
			s11.accept();
			s11.calc();
			s11.display();
			break;
			default:System.out.println("Invalid choice");
		}
	}
}