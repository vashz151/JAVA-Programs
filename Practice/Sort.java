import java.util.*;
public class Sort
{
	public static void main(String args[])
	{
	   int i,n,j,temp;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number of elements:");
	   n=sc.nextInt();
	   int arr[]=new int[n];
	   System.out.println("Enter elements:");
	   for(i=0;i<n;i++)
	   {
	       arr[i]=sc.nextInt();
	   }
	   for(i=0;i<=n-2;i++)
	   {
	       for(j=0;j<=n-2-i;j++)
               {
                   if(arr[j]>arr[j+1])
                   {
                         temp=arr[j];
                         arr[j]=arr[j+1];
                         arr[j+1]=temp;
                   }  
               }
	   }
           System.out.println("Elements after sorting are:");
           for(i=0;i<n;i++)
	   {
	       System.out.println(arr[i]);
	   }
	}
}