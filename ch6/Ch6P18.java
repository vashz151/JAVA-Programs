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
		return i+4;
    	}
}
class Ch6P18
{
    	public static void main(String args[])
    	{
        	int a,choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		a=sc.nextInt();
		Derived d = new Derived();
		Base b=new Base();
		Base ref;
		System.out.print("1.Base\n2.Derived\nEnter your choice:");
		choice=sc.nextInt();
		if(choice==1)
		ref=b;
		else
		ref=d;
		System.out.println("Value after adding is : "+ref.display(a));
    	}
}