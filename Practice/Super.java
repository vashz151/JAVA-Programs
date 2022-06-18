import java.util.*;
public class Super
{
	int super_Digit(int n)
	{
              int d=0;
              if(n!=0)
              {
                     d=n%10;       
                     return (d+super_Digit(n/10));                
              }
              else return d;
	}
	public static void main(String args[])
	{
              int n,ans;
              Scanner sc=new Scanner(System.in);  
              Super s=new Super();      
              System.out.println("Enter a number:");
              n=sc.nextInt();
              ans=s.super_Digit(n);
              System.out.println("Super Digit="+ans);    
	}
}