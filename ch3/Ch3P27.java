import java.util.*;
class Ch3P27
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str;
		int i,n,countV=0,countC=0,spaces=0,digits=0;
		System.out.println("Enter a string:");
		str=sc.nextLine();
		n=str.length();
                str=str.toLowerCase();
		for(i=0;i<=n-1;i++)
		{
			if(str.charAt(i)==' ') spaces++;
			else if(str.charAt(i)>='0' && str.charAt(i)<='9') digits++;
                        else if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') countV++;
                        else if(str.charAt(i)>='a' && str.charAt(i)<='z') countC++;
                }  
		System.out.print("Vowels:"+countV+"\nConsonants:"+countC+"\nSpaces:"+spaces+"\nDigits:"+digits);
	}
}