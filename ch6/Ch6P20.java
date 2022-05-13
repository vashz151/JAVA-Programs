import java.util.Scanner;
class Base
{
	public int display(int i)
    	{
 		return i +6;
    	}
}
class Derived extends Base
{
	public int display(int i)
    	{
		i=super.display(i);
		return i+4;
    	}
}
class Ch6P20
{
    	public static void main(String args[])
    	{
        	int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		a=sc.nextInt();
		Derived obj = new Derived();
		System.out.println("Value after adding 6 to entered number is : "+obj.display(a));
    	}
}