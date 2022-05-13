import java.util.*;
class Ch3P30
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str,str1="";
		int n,i;
		System.out.println("Enter a string:");
		str=sc.nextLine();
		StringBuffer obj=new StringBuffer();
		obj.append(str);
		obj.reverse();
		str1=obj.toString();
		if(str.equalsIgnoreCase(str1)) System.out.println("Palindrome");
		else System.out.println("Not a Palindrome");
	}
}