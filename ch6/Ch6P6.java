import java.util.*;
class Account
{
   protected String name;
   protected int accno;
   protected float bal;
   protected boolean chqbk;
}
class Current extends Account
{ 
   protected float min_bal;
   public Current()
   {
	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name,account number,balance of a customer:");
        name=sc.nextLine();
        accno=sc.nextInt();
        bal=sc.nextFloat();
	chqbk= true;
      	System.out.println("Enter minimum balance:");
	min_bal=sc.nextFloat();
   }
   public void withdraw()
   {
      float wid;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the amount to be withdrawn from an account:");
      wid=sc.nextFloat();
      if(wid>bal) System.out.println("Insufficient balance");
      else
      bal-=wid;
   }
   public void deposit()
   {
      float dep;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the amount to deposit in account:");
      dep=sc.nextFloat();
      bal+=dep;
   }
   public void display()
   {
       System.out.println("Current Balance:"+bal);
   }
   public void penalty()
   {
      if(bal<min_bal) 
      {
   	 System.out.println("Penalty charged for insufficient balance");
	 bal-=100;
      }
   }
}
class Savings extends Account
{   
   protected float intr;
   public Savings()
   {
      	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name,account number,balance of a customer:");
        name=sc.nextLine();
        accno=sc.nextInt();
        bal=sc.nextFloat();
	chqbk= false;
   }
   public void withdraw()
   {
      float wid;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the amount to be withdrawn from an account:");
      wid=sc.nextFloat();
      if(wid>bal) System.out.println("Insufficient balance");
      else
      bal-=wid;
   }
   public void deposit()
   {
      float dep;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the amount to deposit in account:");
      dep=sc.nextFloat();
      bal+=dep;
   }
   public void display()
   {
       System.out.println("Current Balance:"+bal);
   }
   public void interest()
   {
	intr=5*bal/100;
	bal+=intr;
   }
}
public class Chp6P6
{
   public static void main(String args[])
   {
     
      Scanner sc=new Scanner(System.in);
      int choice;
      Account c=new Account();
      System.out.println("1.Current account type\n2.Savings account type\nEnter your choice:");
      choice=sc.nextInt();
      switch(choice)
      { 
           case 1:Current c1=new Current();
           c1.withdraw();
           c1.deposit();
	   c1.display();
	   c1.penalty();
           break;
           case 2:Savings c2=new Savings();
           c2.deposit();
           c2.withdraw();
	   c2.interest();
	   c2.display();
	   break;
           default:System.out.println("Invalid choice");
       }
    }
}
     