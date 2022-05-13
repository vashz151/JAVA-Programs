import java.util.*;
public class Large
{
          public static void main(String args[])
          {
                   int x,y,large;
                   Scanner sc=new Scanner(System.in);
                   System.out.print("Enter two numbers:");
                   x=sc.nextInt();
                   y=sc.nextInt();
                   large=(x>y)?x:y;
                   System.out.println("Larger Of Given Numbers is="+large); 
           }
}