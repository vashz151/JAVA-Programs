import java.util.*;
class BitwiseOperators
{
	public static void main(String args[])
	{
		int n1, n2, res;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 2 numbers:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println(n1+" & "+n2+" = "+(n1 & n2));
		res=n1 | n2;
		System.out.println(n1+" | "+n2+" = "+res);
		res = n1 ^ n2;
		System.out.println(n1+" ^ "+n2+" = "+res);
		res = ~n1;
		System.out.println("NOT of "+n1+" = "+res);
		res = ~n2;
		System.out.println("NOT of "+n2+" = "+res);
	}
}