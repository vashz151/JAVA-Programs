import java.util.*;
class Employee
{
        private int empid;
        private String empname, designation;
        private float salary;
        public void get_employee()
        {
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter employee name, designation , id and salary:");
                empname=sc.nextLine();
                designation=sc.nextLine();
                empid=sc.nextInt();
                salary=sc.nextFloat();
         }
         public boolean compare(Employee e)
	 {
		if(salary<e.salary) return true;
		else return false;
	 }
         public void show_employee()
         {
                 
                System.out.println(empname+"\t"+empid+"\t"+designation+"\t\t"+salary);
         }
}
public class Ch5P18
{
         public static void main(String args[])
         {
                int i,j,n;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter number of employees:");
                n=sc.nextInt();
                Employee e[]=new Employee[n];
                Employee temp=new Employee();
                for(i=0;i<=n-1;i++)
                {
                       e[i]=new Employee();
                       e[i].get_employee();
                }
                for(i=0;i<=n-2;i++)
                {
                       for(j=0;j<=n-2-i;j++)
                       {
                              if(e[j].compare(e[j+1])) 
                              { 
                                      temp=e[j];
                                      e[j]=e[j+1];
                                      e[j+1]=temp;
                              }  
                       }
                }
                System.out.println("Name\tID\tDesignation\tSalary");
                for(i=0;i<=n-1;i++)
                {
                       e[i].show_employee();
                }    
         } 
}              