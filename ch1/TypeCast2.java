import java.util.*;
class TypeCast2
{
	public static void main(String args[])
	{
		int x;
		char y;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer:");
		x=sc.nextInt();
		y=(char)x;
		System.out.println("ASCII equivalent of:"+y);
	}
}