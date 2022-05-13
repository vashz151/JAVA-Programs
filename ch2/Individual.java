import java.util.*;
class Individual
{
	public static void main(String args[])
	{
		int n,d,rev=0,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		n=sc.nextInt();
                System.out.println("Individual digits are=");
		while(n!=0)
		{
			d=n%10;
                        rev=rev*10+d;
                        count++;
			n=n/10;
		}
                while(count!=0)
		{
			d=rev%10;
                        count--;
			rev=rev/10;
                        System.out.print(+d+"\t");
		}
	}
}