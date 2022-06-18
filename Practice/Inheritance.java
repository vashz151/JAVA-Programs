import java.util.*;
class Staff
{
   protected String name;
   protected int code;
   public void read()
   {
      Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the name and code(id) of staff :");
      name=sc.nextLine();
      code=sc.nextInt();
   }
}
class Teacher extends Staff
{ 
   protected String sub;
   protected int exp;
   public void read()
   {
      super.read();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the subject taught by teacher and the work exprience:");
      sub=sc.nextLine();
      exp=sc.nextInt();
   }
   public void display()
   {
      System.out.println("Name of staff:"+name+"\nCode(Id) of staff:"+code+"\nSubject taught by teacher:"+sub+"\nWork exprience:"+exp);
   }
}
class Typist extends Staff
{
   protected int exp,speed;
}
class Officer extends Staff
{
   protected String grade,dept;
   public void read()
   {	
      super.read();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the grade and department of an officer:");
      grade=sc.nextLine();
      dept=sc.nextLine();
   }
   public void display()
   {
      System.out.println("Name of staff:"+name+"\nCode(Id) of staff:"+code+"\nGrade of an officer:"+grade+"\nDepartment of an officer:"+dept);
   }
}
class Regular extends Typist
{
   protected float sal;
   public void read()
   {
      super.read();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the typing speed of a typist(number of words per minute) and the work exprience:");
      speed=sc.nextInt();
      exp=sc.nextInt();
      System.out.println("Enter the salary of a regular typist:");
      sal=sc.nextFloat();
   }
   public void display()
   {
        
      System.out.println("Name of staff:"+name+"\nCode(Id) of staff:"+code+"\nTyping speed of a typist(number of words per minute):"+speed+"\nWork exprience:"+exp+"\nSalary of a regular typist:"+sal);
   }
}
class Casual extends Typist
{
   protected float daily_wages;
   public void read()
   {
      super.read();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the typing speed of a typist(number of words per minute) and the work exprience:");
      speed=sc.nextInt();
      exp=sc.nextInt();
      System.out.println("Enter the daily wages given to a casual typist:");
      daily_wages=sc.nextFloat();
   }
   public void display()
   {
      System.out.println("Name of staff:"+name+"\nCode(Id) of staff:"+code+"\nTyping speed of a typist(number of words per minute):"+speed+"\nWork exprience:"+exp+"\nDaily wages given to a casual typist:"+daily_wages);
   } 
}
public class Inheritance
{
   public static void main(String args[])
   {
     
        Scanner sc=new Scanner(System.in);
        int choice=0;
        while(choice!=5)
        {
            System.out.println("1.Teacher\n2.Officer\n3.Regular Typist\n4.Casual Typist\n5.Exit\nEnter your choice:");
            choice=sc.nextInt();
            switch(choice)
            { 
                case 1:Teacher t=new Teacher();
                t.read();
                t.display();
                break;
                case 2:Officer o=new Officer();
                o.read();
                o.display();
                break;
                case 3:Regular r=new Regular();
                r.read();
                r.display();
                break;
                case 4:Casual c=new Casual();
                c.read();
                c.display();
                break;
                case 5: 
                break;
                default:System.out.println("Invalid choice");
            }

        }
    }
}
     