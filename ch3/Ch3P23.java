import java.util.*;
public class Ch3P23
{
	public static void main(String args[])
	{
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		str1=sc.nextLine();
		str2=str1.substring(1);
		str1=str1.substring(0,1);
		str1=str1.toUpperCase();
		str2=str2.toLowerCase();
		str1=str1.concat(str2);
		System.out.println("String in sentence case is:"+str1);
	}
}