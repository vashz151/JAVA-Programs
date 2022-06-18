import java.util.*;
class Student
{
	public String name;
       public int id;
       void addStudents()
       {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter name:");
              name=sc.nextLine();
              System.out.println("Enter id:");
              id=sc.nextInt();
       }
       int  pickwinner(int n)
       {
              int k;
              Random r=new Random();
              k=r.nextInt(n);
              return k;
       }
}
class Lottery
{
       public static void main(String args[])
	{
              int i,n,ans;
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter number of Students:");
              n=sc.nextInt();
              Student j=new Student();
              Student s[]=new Student[n];
              for(i=0;i<n;i++)
              {
                     s[i]=new Student();
                     System.out.println("Enter details of Student"+(i+1));
                     s[i].addStudents();
              }
              ans=j.pickwinner(n);
              System.out.println("Winner="+s[ans].name+"\nId"+s[ans].id);

       }
}