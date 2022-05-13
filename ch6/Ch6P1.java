import java.util.Scanner;
class Data
{
	protected int a,b;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
	}
}
class Sum extends Data
{
	private int sum;
	public void add()
	{
		sum=a+b;
	}
	public void display()
	{
		System.out.println("Sum="+sum);
	}
}
public class Ch6P1
{
	public static void main(String args[])
	{
		Sum s=new Sum();
		s.accept();
		s.add();
		s.display();
	}
}