import java.util.*;
public class Switch
{
	public static void main(String args[])
	{
		int choice=0,a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		while(choice!=6)
		{
			System.out.println("1.Add\n2.Sub\n3.Multiply\n4.Quotient\n5.Remainder\n6.Exit\nEnter your choice:");
		    choice=sc.nextInt();
			switch(choice)
			{
				case 1:System.out.println("Addition="+(a+b));
				break;
				case 2:System.out.println("Subtraction="+(a-b));
				break;
				case 3:System.out.println("Multiplication="+(a*b));
				break;
				case 4:System.out.println("Quotient="+(a/b));
				break;
				case 5:System.out.println("Remainder="+(a%b));
				break;
				case 6:
				break;
				default:System.out.println("Invalid choice");

			}
		}
	}
}