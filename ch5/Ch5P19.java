import java.util.*;
class Test
{
	private static int x;
	public Test()
	{
		x++;
	}
	public static void display()
	{
		System.out.println("Number of objects created="+x);
	}
}
public class Ch5P19
{
	public static void main(String args[])
	{
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		Test.display();
	}
}