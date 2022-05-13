import java.util.*;
class Data
{
	protected float rad;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		rad=sc.nextFloat();
	}
}
class Area extends Data
{
	protected float area;
	public void calc()
	{
		area=3.14f*rad*rad;
	}
	public void display()
	{
		System.out.println("Area="+area);
	}
}
class Volume extends Area
{
	private float vol;
	public void calc()
	{
		super.calc();
		vol=4*area*rad/3;
	}
	public void display()
	{
		super.display();
		System.out.println("Volume="+vol);
	}
}
public class Ch6P3
{
	public static void main(String args[])
	{
		Volume s=new Volume();
		s.accept();
		s.calc();
		s.display();
	}
}