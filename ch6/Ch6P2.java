import java.util.Scanner;
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
	private float area;
	public void calc()
	{
		area=3.14f*rad*rad;
	}
	public void display()
	{
		System.out.println("Area="+area);
	}
}
public class Ch6P2
{
	public static void main(String args[])
	{
		Area s=new Area();
		s.accept();
		s.calc();
		s.display();
	}
}