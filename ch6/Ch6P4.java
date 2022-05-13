import java.util.*;
class Person
{
         protected String name,address;
         public void accept()
         {
                System.out.println("Enter name, address, bank name, IFSC Code and account number:");
                Scanner sc=new Scanner(System.in);
                name=sc.nextLine();
                address=sc.nextLine();
         }
}
class Account extends Person
{
         protected long accountNumber;
         protected String bank_name,ifsc;
         public void accept()
         { 
                super.accept();
                Scanner sc=new Scanner(System.in);
                bank_name=sc.nextLine();
                ifsc=sc.nextLine();
                accountNumber=sc.nextLong();
         }
}
class Admin extends Account
{
         public void display()
         {
                System.out.println("Name \t\tAddress   Account Number Bank IFSC Code");
                System.out.println(name+"\t"+address+" "+accountNumber+" "+bank_name+" "+ifsc);
         }
}
public class Ch6P4
{
         public static void main(String args[])
         {
                int i,n;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter number of user:");
                n=sc.nextInt();
                Admin b[]=new Admin[n];
                for(i=0;i<=n-1;i++)
                {
                        b[i]=new Admin();
                        b[i].accept();
                }
                for(i=0;i<=n-1;i++)
                {
                        b[i].display();
                }
         }
}
                
                
                
                
                 
         