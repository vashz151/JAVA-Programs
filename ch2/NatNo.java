import java.util.*;
class NatNo
{
	public static void main(String args[])
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		n=sc.nextInt();
		i=1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}