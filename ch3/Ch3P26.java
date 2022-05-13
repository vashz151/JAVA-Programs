import java.util.*;
class Ch3P26
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str;
		int i,n,count=0;
		System.out.println("Enter a string:");
		str=sc.nextLine();
		n=str.length();
		char a[]=new char[n];
		a=str.toCharArray();
		for(i=0;i<=n-1;i++)
		{
			switch (a[i]) 
                        {
                             case 'a':
                             case 'e':
                             case 'i':
                             case 'o':
                             case 'u':
                             case 'A':
                             case 'E':
                             case 'I':
                             case 'O':
                             case 'U':count++;
                             break;
                        }
         
		}
		System.out.println("Number of vowels:"+count);
	}
}