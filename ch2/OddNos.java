import java.util.*;
class OddNos
{
	public static void main(String args[])
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		n=sc.nextInt();
		for(i=1;i<=n;i+=2)
		{
			System.out.println(i);
		}
		
	}
}