import java.util.*;
public class Calculator
{
	public static void main(String args[])
	{
		int n1,n2;
		char choice;
		String x;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter two numbers:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("+.Add\n-.Sub\n*.Mul\n/.Div\nEnter your choice:");
		x=sc.next();
		choice=x.charAt(0);
		switch(choice)
		{
			case '+':System.out.print("Sum= "+(n1+n2));
			break;
			case '-':System.out.print("Difference= "+(n1-n2));
			break;
			case '*':System.out.print("Product= "+(n1*n2));
			break;
			case '/':if(n2==0) System.out.println("Quotient= Infinity");
			else System.out.print("Quotient= "+(n1/n2));
			break;
			default:System.out.print("Invalid choice ");
		}
	}
}