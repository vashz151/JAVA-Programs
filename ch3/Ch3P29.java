import java.util.*;
class Ch3P29
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str,str1=0;
		int n,i;
		System.out.println("Enter a string:");
		str=sc.nextLine();
		n=str.length();
		for(i=n-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		if(str.equalsIgnoreCase(str1)) System.out.println("Palindrome");
		else System.out.println("Not a Palindrome");
	}
}