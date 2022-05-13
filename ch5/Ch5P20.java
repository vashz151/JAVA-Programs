import java.util.*;
class Test
{
	private int x;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		x=sc.nextInt();
	}
	public Test compare(Test s)
	{
		if(x < s.x) return s;
		else return this;
	}
	public void display()
	{
		System.out.println("x="+x);
	}
}
public class Ch5P20
{
	public static void main(String args[])
	{
		Test t1=new Test();
		Test t2=new Test();
		t1.accept();
		t2.accept();
		Test t3=t1.compare(t2);
		System.out.print("Greater object has ");
		t3.display();
	}
}