import java.util.*;
public class Marks
{
	public static void main(String args[])
	{
	   int i,j,m,n,sum=0;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number of students and subjects:");
	   m=sc.nextInt();
	   n=sc.nextInt();
	   int a[][]=new int [m][n];
	   int rsum[]=new int [m];
	   int csum[]=new int [n];
	   System.out.println("Enter student marks in each subject:");
	   for(i=0;i<m;i++)
	   {
	        System.out.println("Marks of Student"+(i+1)+"in each subject:");
	        for(j=0;j<n;j++)
	   	    {   
	   	        a[i][j]=sc.nextInt();
	   	        sum+=a[i][j];
	   	    }
	   }
	   for(i=0;i<m;i++)
	   {
	   	   for(j=0;j<n;j++)
	   	   {
	   	   	    rsum[i]+=a[i][j];
	   	   }
	   }
	   for(j=0;j<n;j++)
	   {
	   	   for(i=0;i<m;i++)
	   	   {
	   	   	    csum[j]+=a[i][j];
	   	   }
	   }
	   System.out.println("Required output is as follows:");
	   System.out.println("\t\tSub1\tSub2\tSub3	|	Total");
       for(i=0;i<m;i++)
	   {
	       System.out.print("Student"+(i+1)+"	");
	       for(j=0;j<n;j++)
	   	   {
	   	   	    System.out.print(a[i][j]+"	");     
	   	   }
	   	   System.out.println("|	"+rsum[i]);
	   }
	   System.out.println("____________________________________________________");
	   System.out.print("Total		");
	   for(i=0;i<n;i++)
	   {
	       System.out.print(csum[i]+"	");
	   }
	   System.out.print("|	"+sum);
	}
}