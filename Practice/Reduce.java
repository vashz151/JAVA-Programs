import java.util.*;
class Reduce 
{
    public static void main(String[] args) 
    {
        int i;
        String s1 ="";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string in lower case:");
        String str=sc.nextLine();
        char a[]=new char[str.length()];
        a = str.toCharArray();
        for(i=0;i<str.length()-1;i++)
        {
            if(a[i]==a[i+1])
            {
                a[i]=' ';
                a[i+1]=' '; 
            } 
        }
        for(i=0;i<str.length();i++)
        {
            if(a[i]!=' ')
            {
                s1+=a[i];
            }
        }
        str=s1;
        if(s1=="")
        {
            System.out.println("Empty String");
        }
        else
        {
            System.out.println("Final String:"+s1.trim());
        }
    }
}