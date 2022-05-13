import java.util.*;
public class Pattern01
{
        public static void main(String args[])
        {
              int i,n,j;
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter number of lines:");
              n=sc.nextInt();
              for(i=1;i<=n;i++)
              {
                       for(j=1;j<=i;j++)
                       {
                               System.out.print("*");
                       }
                       System.out.print("\n");
              }
        }
}	