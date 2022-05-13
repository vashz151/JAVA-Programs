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
class Square extends Shape
{
	private float side;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side:");
		side=sc.nextFloat();
	}
	public void calc()
	{
		area=side*side;
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
		System.out.println("1.Square\n2.Triangle\nEnter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:Square s=new Square();
			s.accept();
			s.calc();
			s.display();
			break;
			case 2:Triangle t=new Triangle();
			t.accept();
			t.calc();
			t.display();
			break;
			default:System.out.println("Invalid choice");
		}
	}
}