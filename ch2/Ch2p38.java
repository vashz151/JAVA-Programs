import java.util.*;
public class Ch2p38 
{
        public static void main(String args[])
        {
                 int n;  
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter a number:");
                 n=sc.nextInt();
                 if(n%10==0) System.out.println("Divisible by 10");
                 else System.out.println("Not divisible by 10");
        }
} 