import java.util.*;
public class Menu
{
	int  GCD(int x, int y)
	{
              if(y==0) return x;
              return(GCD(y,x%y));
	}
	int LCM(int n1, int n2,int lcm)
	{
              if(lcm%n2!=0 || lcm%n1!=0)
              {
                     lcm++;
                     return LCM(n1,n2,lcm);
              }
              else return lcm;
	}
	int XY(int x,int y)
	{
              if(y==0) return 1;
              return (x* XY(x,y-1));
	}
	int fibo(int i)
	{
              if(i==1) return 0;
              if(i==2) return 1;
              return (fibo(i-1)+fibo(i-2));
	}
	int reverse(int n,int s)
	{
              int d;
              if(n!=0)
              {
                     d=n%10;       
        	           s=s*10+d;
                     return reverse(n/10,s);                
              }
              else return s;
	}
	public static void main(String args[])
	{
              int x,y,n,ans,choice=0;
              Scanner sc=new Scanner(System.in);  
              Menu m=new Menu();      
              while(choice!=5)
              { 	
                 System.out.println("\n1:GCD & LCM\n2.X^Y\n3.Fibonacci\n4.Reverse\n5.Exit\nEnter your Choice:");
                 choice=sc.nextInt();                 
                 switch(choice)
                 {
                     case 1:System.out.println("Enter two numbers:");
                            x=sc.nextInt();
                            y=sc.nextInt();
                            ans=m.GCD(x,y);
                            if(ans==1) System.out.println("GCD doesn't exist");
                            else System.out.println("GCD="+ans);
                            if(x>y) ans=m.LCM(x,y,x);
                            else ans=m.LCM(x,y,y); 
                            System.out.println("LCM="+ans);                 
                     break;
                     case 2:System.out.println("Enter value of x and y:");
                            x=sc.nextInt();
                            y=sc.nextInt();
                            ans=m.XY(x,y);
                            System.out.println("Answer="+ans);
                     break;
                     case 3:System.out.println("Enter number of elements:");
                            n=sc.nextInt();
                            System.out.println("Fibonacci series:");
                            for(int i=1;i<=n;i++)
                            {
                       	       System.out.println(m.fibo(i));
                            }
                     break;
                     case 4:System.out.println("Enter a number:");
                            n=sc.nextInt();
                            ans=m.reverse(n,0);
                            System.out.println("Reverse of number:"+ans); 
                     break;
                 }
              }
     
	}
}