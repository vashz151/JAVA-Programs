import java.util.*;
public class Ch3P22
{
	public static void main(String args[])
	{
		String str1,str2,str3;
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		str1=sc.nextLine();
		n=str1.length();
		str2=str1.substring(1);
		str1=str1.substring(0,1);
		str1=str1.toUpperCase();
		str2=str2.toLowerCase();
		str1=str1.concat(str2);
		for(i=1;i<=n-1;i++)
		{
			if(str1.charAt(i)==' ')
			{
				str3=str1.substring(0,i+1);
				str2=str1.substring(i+1,i+2);
				str1=str1.substring(i+2);
				str2=str2.toUpperCase();
				str1=str2.concat(str1);
				str1=str3.concat(str1);
			}
		}
		System.out.println("String in title case is:"+str1);
	}
}