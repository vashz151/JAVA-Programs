import java.util.*;
class Test
{
	private int a,b;
	public void swap(int a,int b)
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping in the swap method: a="+a+" b="+b);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		Test t=new Test();
		t.a=sc.nextInt();
		t.b=sc.nextInt();
		System.out.println("Numbers entered are: a="+t.a+" and b="+t.b);
		t.swap(t.a,t.b);
		System.out.println("After returning from the swap function: a="+t.a+" and b="+t.b);
	}

}