import java.util.*;
public class Pattern14
{
        public static void main(String args[])
        {
              int i,n,j;
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter number of lines:");
              n=sc.nextInt();
              for(i=n;i>=1;i--)
              {
                       for(j=i;j>=1;j--)
                       {
                               System.out.print("*");
                       }
                       System.out.print("\n");
              }
        }
}	