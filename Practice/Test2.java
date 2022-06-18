//This method copies an array from a source array to a destination array, 
//starting the copy action from the source position to the specified position till the specified length.
import java.util.*;
public class Test2
{
	public static void main(String args[])
	{
		int i,n,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<=n-1;i++)
		{
			System.out.print("Enter total marks:");
			a[i]=sc.nextInt();
		}
		for(i=0;i<=n-2;i++)
		{
			for(j=0;j<=n-2-i;j++)
			{
				if(a[j]<a[j+1]) 
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		int top[]=new int[3];
		System.arraycopy(a,0,top,0,3);
                //here we copy from source array a after sorting  to destination array top where 3 denotes number of element to be copied 
		System.out.println("Top three marks are:");
		for(i=0;i<=2;i++)
		{
			System.out.println(top[i]);
		}
	}
}