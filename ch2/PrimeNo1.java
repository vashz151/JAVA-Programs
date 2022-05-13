import java.util.*;
class PrimeNo1
{
	public static void main(String args[])
	{
		int n=2,i,count;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count of prime numbers:");
		count=sc.nextInt();
		System.out.println("The following are first "+count+" prime numbers");
		while(count!=0)
		{
			i=2;
			while(n%i!=0)
			{
				i++;
			}
			if(n==i)
			{
				System.out.println(n);
				count--;
			}
			n++;
		}
	}
}