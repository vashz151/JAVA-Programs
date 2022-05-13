import java.util.*;
public class Series4
{
      public static void main(String args[])
      {
              int i,n;
              float sum=0.5f;
              Scanner sc=new Scanner(System.in);
              System.out.print("Enter the value of n:");
              n=sc.nextInt();
              for(i=3;i<=n;i++)
              {
                     sum+=(1.0f/i);
              }
              System.out.println("Sum of the given series="+sum);
      }
}