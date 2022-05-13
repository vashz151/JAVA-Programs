import java.util.Scanner;
class Base
{
	public int display(int i)
    	{
 		return i +6;
    	}
	public void finalize()
    	{
		System.out.println("In the finalize method");
    	}
}
class Ch6P19
{
    	public static void main(String args[])
    	{
        	abc();
		    System.gc();
    	}
	static void abc()
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		a=sc.nextInt();
		Base b=new Base();
		System.out.println("Value after adding is : "+b.display(a));
	}
}