import java.util.*;
class Staff
{
   protected String name;
   protected int code;
}
class Teacher extends Staff
{ 
   protected String sub;
   protected int exp;
   public void accept()
   {
      	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name and code(id) of staff :");
        name=sc.nextLine();
        code=sc.nextInt();
        sc.nextLine();
      	System.out.println("Enter the subject taught by teacher and the work experience:");
      	sub=sc.nextLine();
      	exp=sc.nextInt();
   }
   public void display()
   {
       System.out.println("Name of staff:"+name+"\nCode(Id) of staff:"+code+"\nSubject taught by teacher:"+sub+"\nWork Experience:"+exp);
   }
}
class Typist extends Staff
{
   protected int expe,speed;
}
class Officer extends Staff
{
   protected String grade,dept;
   public void accept()
   {
      	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name and code(id) of staff :");
        name=sc.nextLine();
        code=sc.nextInt();
	sc.nextLine();
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
   public void accept()
   {
      
      	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name and code(id) of staff :");
        name=sc.nextLine();
        code=sc.nextInt();
      	System.out.println("Enter the typing speed of a typist(number of words per minute) and the work experience:");
      	speed=sc.nextInt();
      	expe=sc.nextInt();
      	System.out.println("Enter the salary of a regular typist:");
      	sal=sc.nextFloat();
   }
   public void display()
   {
        
        System.out.println("Name of staff:"+name+"\nCode(Id) of staff:"+code+"\nTyping speed of a typist(number of words per minute):"+speed+"\nWork experience:"+expe+"\nSalary of a regular typist:"+sal);
   }
}
class Casual extends Typist
{
   protected float wages;
   public void accept()
   {
      	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name and code(id) of staff :");
        name=sc.nextLine();
        code=sc.nextInt();
      	System.out.println("Enter the typing speed of a typist(number of words per minute) and the work experience:");
      	speed=sc.nextInt();
      	expe=sc.nextInt();
      	System.out.println("Enter the daily wages given to a casual typist:");
      	wages=sc.nextFloat();
   }
   public void display()
   {
        System.out.println("Name of staff:"+name+"\nCode(Id) of staff:"+code+"\nTyping speed of a typist(number of words per minute):"+speed+"\nWork experience:"+expe+"\nDaily wages given to a casual typist:"+wages);
   } 
}
public class Ch6P5
{
   public static void main(String args[])
   {
     
      Scanner sc=new Scanner(System.in);
      int choice;
      System.out.println("1.Information about Teacher\n2.Information about Officer\n3.Information about Regular Typist\n4.Information about Casual Typist\nEnter your choice:");
      choice=sc.nextInt();
      switch(choice)
      { 
           case 1:Teacher c1=new Teacher();
           c1.accept();
           c1.display();
           break;
           case 2:Officer c2=new Officer();
           c2.accept();
           c2.display();
           break;
           case 3:Regular c3=new Regular();
           c3.accept();
           c3.display();
           break;
           case 4:Casual c4=new Casual();
           c4.accept();
           c4.display();
           break;
           default:System.out.println("Invalid choice");
       }
    }
}
     