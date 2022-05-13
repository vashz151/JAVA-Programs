import java.util.*;
public class GCD
{
	public static void main(String args[])
	{
		int n1,n2,gcd;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter two numbers:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		if(n1<n2) gcd=n1;	
		else gcd=n2;
		while(true)
		{
			if(n1%gcd!=0 || n2%gcd!=0)
			gcd--;
			else break;
		}
		if(gcd==1) System.out.println("GCD doesn't exists");
		else System.out.println("GCD = "+gcd);
	}
}