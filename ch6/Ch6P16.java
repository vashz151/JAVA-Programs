import java.util.*;
class Volume
{
	private float vol;
	public float calculate(float side)
	{
		vol=side*side*side;
		return vol;
	}
	public float calculate(float r,float h)
	{
		vol=3.14f*r*r*h;
		return vol;
	}
	public float calculate(float a,float b,float c)
	{
		vol=a*b*c;
		return vol;
	}
}
public class Ch6P16
{
	public static void main(String args[])
	{
		Volume a1=new Volume();
		int choice;
		float a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("1.Cube\n2.Cylinder\n3.Cuboid\nEnter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:System.out.print("Enter the length of a side:");
			a=sc.nextFloat();
			System.out.println("Volume="+a1.calculate(a));
			break;
			case 2:System.out.print("Enter the radius and hieght:");
			a=sc.nextFloat();
			b=sc.nextFloat();
			System.out.println("Volume="+a1.calculate(a,b));
			break;
			case 3:System.out.print("Enter the length of three sides:");
			a=sc.nextFloat();
			b=sc.nextFloat();
			c=sc.nextFloat();
			System.out.println("Volume="+a1.calculate(a,b,c));
			break;
			default:System.out.println("Invalid choice");
		}
	}
}