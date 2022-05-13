import java.util.*;

class C3P19
{
	public static void main(String args[])
	{
		int n,high,i,s = 0,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of students: ");
		n = sc.nextInt();
		int student[][] = new int[n][5];
		for(i = 0;i<=n-1;i++)
		{
			System.out.println("Enter your roll.no,maths marks,chemistry marks,physics marks");
			for(j = 0;j<=3;j++)
			{
				student[i][j] = sc.nextInt();
			}
			student[i][4] = student[i][1] + student[i][2] + student[i][3]; 
		}
		high = student[0][4];
		for(i = 1;i<=n-1;i++)
		{
			if(high < student[i][4])
			{
				high = student[i][4];
				s = i;
			}
			
		}
		System.out.println("Roll.no\tMaths marks\tChemistry marks\tPhysics marks\tTotal Marks");
		System.out.println("-------------------------------------------------------------------");
		for(i = 0;i<=n-1;i++)
		{
			System.out.println(student[i][0] + "\t" + student[i][1] + "\t\t" + student[i][2] + "\t\t" + student[i][3] + "\t\t" + student[i][4]);
			System.out.println("-------------------------------------------------------------------");	
				
			
		}
		System.out.println("Highest Marks scored by");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Roll.no\tMaths marks\tChemistry marks\tPhysics marks\tTotal Marks");
		System.out.println("-------------------------------------------------------------------");
		System.out.println(student[s][0] + "\t" + student[s][1] + "\t\t" + student[s][2] + "\t\t" + student[s][3] + "\t\t" + student[s][4]);
		System.out.println("-------------------------------------------------------------------");	
		
		
	}
}