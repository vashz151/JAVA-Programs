import java.util.*;
class Area
{
	private float area;
	public float calculate(float rad)
	{
		area=3.14f*rad*rad;
		return area;
	}
	public float calculate(float l,float b)
	{
		area=l*b;
		return area;
	}
	public float calculate(float a,float b,float c)
	{
		float s=(a+b+c)/2;
		area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
}
public class Ch6P15
{
	public static void main(String args[])
	{
		Area a1=new Area();
		int choice;
		float a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("1.Circle\n2.Rectangle\n3.Triangle\nEnter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:System.out.print("Enter the radius:");
			a=sc.nextFloat();
			System.out.println("Area="+a1.calculate(a));
			break;
			case 2:System.out.print("Enter the length and breadth:");
			a=sc.nextFloat();
			b=sc.nextFloat();
			System.out.println("Area="+a1.calculate(a,b));
			break;
			case 3:System.out.print("Enter the length of three sides:");
			a=sc.nextFloat();
			b=sc.nextFloat();
			c=sc.nextFloat();
			System.out.println("Area="+a1.calculate(a,b,c));
			break;
			default:System.out.println("Invalid choice");
		}
	}
}