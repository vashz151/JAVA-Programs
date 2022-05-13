import java.util.*;
class Test
{
	private int a,b;
	public void swap(Test t)
	{
		int temp;
		temp=t.a;
		t.a=t.b;
		t.b=temp;
		System.out.println("After swapping in the swap method: a="+t.a+" b="+t.b);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		Test t=new Test();
		t.a=sc.nextInt();
		t.b=sc.nextInt();
		System.out.println("Numbers entered are: a="+t.a+" and b="+t.b);
		t.swap(t);
		System.out.println("After returning from the swap function: a="+t.a+" and b="+t.b);
	}

}