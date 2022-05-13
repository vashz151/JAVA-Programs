import java.util.*;
public class Words
{
	public static void main(String args[])
	{
		int d,n,rev=0,count=0;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter a  number:");
		n=sc.nextInt();
		while(n!=0)
		{
			d=n%10;
			rev=rev*10+d;
			n=n/10;
			count++;
		}
		while(count!=0)
		{
			d=rev%10;
			switch(d)
			{
				case 0:System.out.print("Zero ");
				break;
				case 1:System.out.print("One ");
				break;
				case 2:System.out.print("Two ");
				break;
				case 3:System.out.print("Three ");
				break;
				case 4:System.out.print("Four ");
				break;
				case 5:System.out.print("Five ");
				break;
				case 6:System.out.print("Six ");
				break;
				case 7:System.out.print("Seven ");
				break;
				case 8:System.out.print("Eight ");
				break;
				case 9:System.out.print("Nine ");
			}
			rev=rev/10;
			count--;
		}
	}
}