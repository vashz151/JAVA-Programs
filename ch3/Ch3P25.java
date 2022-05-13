import java.util.*;
class Ch3P25
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str,str1;
		int i,n;
		System.out.println("Enter a string:");
		str=sc.nextLine();
		n=str.length();
		char a[]=new char[n];
		a=str.toCharArray();
		for(i=0;i<=n-1;i++)
		{
			System.out.println(i+"\t"+a[i]);
		}
	}
}