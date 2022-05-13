import java.util.*;
class ReverseDigits
{
	public static void main(String args[])
	{
		int n,d,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		n=sc.nextInt();
		while(n!=0)
		{
			d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		System.out.println("Reverse Number="+rev);
	}
}