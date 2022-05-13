import java.util.*;
public class Swap
{
          public static void main(String args[])
          {
                   int x,y,temp;
                   Scanner sc=new Scanner(System.in);
                   System.out.print("Enter two numbers:");
                   x=sc.nextInt();
                   y=sc.nextInt();
                   temp=x;
                   x=y;
                   y=temp;
                   System.out.println("After Swapping Of Given Numbers x="+x+"\ny="+y); 
           }
}