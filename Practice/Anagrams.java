/*
Two strings, a and b are called anagrams if they contain all the same characters
in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA. 
If a and b are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.
*/
import java.util.*;
public class Anagrams 
{
    char arr[];
    char arr1[];
    static void sorting(char array[])
    {
        char temp;
        for(int i=0;i<array.length;i++) 
        {
            for(int j=i+1;j<array.length;j++) 
           {
                if (array[j]<array[i]) 
                {
                    //Comparing the characters one by one
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
    static boolean isAnagram(String A, String B)
    {
        A=A.toLowerCase();
	    B=B.toLowerCase();
	    boolean f=false;
	    char arr[]=A.toCharArray();
        sorting(arr);
	    char arr1[]=B.toCharArray();
        sorting(arr1);
	    String a=new String(arr);
        String b=new String(arr1);
        if (a.equals(b)) 
        {
	        f=true;
        }
        return f;
    }
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        String a;
        System.out.println("Enter String 1:");
        a=sc.next();
        String b;
        System.out.println("Enter String 1:");
        b=sc.next();
        boolean ret=isAnagram(a,b);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}