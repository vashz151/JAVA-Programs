import java.util.*;
class Ch3P28
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str;
		int i,n,countL=0,countU=0,spaces=0,digits=0;
		System.out.println("Enter a string:");
		str=sc.nextLine();
		n=str.length();
		char a[]=new char[n];
		a=str.toCharArray();
		for(i=0;i<=n-1;i++)
		{
			if(a[i]==' ') spaces++;
			else if(a[i]>='0' && a[i]<='9') digits++;
			else if(a[i]>='A' && a[i]<='Z') countU++;
			else if(a[i]>='a' && a[i]<='z') countL++;
		}
		System.out.println("Digits:"+digits+"\nSpaces:"+spaces+"\nCount of Upper case alphabets:"+countU+"\nCount of lower case alphabets:"+countL);
	}
}