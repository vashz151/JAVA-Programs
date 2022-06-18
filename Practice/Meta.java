import java.util.*;
public class Meta
{
	public static void main(String args[])
	{
	    
	    int i,j=-1,l=-1,count=0;
	    String s1,s2;
	    Scanner sc=new Scanner(System.in);
            System.out.println("Enter string 1:");
            s1=sc.nextLine();
            System.out.println("Enter string 1:");
            s2=sc.nextLine();
            if(s1.length()==s2.length())
            {
        	s1=s1.toLowerCase();
        	s2=s2.toLowerCase();
        	for(i=0;i<s1.length();i++)
        	{
                     if(s1.charAt(i)!=s2.charAt(i))
                     {
                	++count;
                        if(count>2) break;
                        j=l;
                        l=i;
                     }
                }
             }
             if (count==2 &&  s1.charAt(j)==s2.charAt(l) && s1.charAt(l)==s2.charAt(j))
             System.out.println("Meta Strings");
             else  System.out.println("Not Meta Strings");    
	} 
}