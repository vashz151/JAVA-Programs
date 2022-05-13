import java.util.*;
public class Ch3P20
{
	public static void main(String args[])
	{
		int i,n,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		n=sc.nextInt();
		int x[]=new int[n];
		for(i=0;i<=n-1;i++)
		{
			System.out.print("Enter total marks:");
			x[i]=sc.nextInt();
		}
		for(i=0;i<=n-2;i++)
		{
			for(j=0;j<=n-2;j++)
			{
				if(x[j]>x[j+1]) 
				{
					temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		int top[]=new int[3];
		System.arraycopy(x,x.length-3,top,0,3);
		System.out.println("Top three marks are:");
		for(i=0;i<=2;i++)
		{
			System.out.println(top[i]);
		}
	}
}