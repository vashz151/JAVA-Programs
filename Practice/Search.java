import java.util.*;
public class Search
{
	public static void main(String args[])
	{
	   int i,n,value;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number of elements:");
	   n=sc.nextInt();
	   int arr[]=new int[n];
	   System.out.println("Enter elements:");
	   for(i=0;i<n;i++)
	   {
	       arr[i]=sc.nextInt();
	   }
	   System.out.println("Enter element to be searched:");
	   value=sc.nextInt();
	   for(i=0;i<arr.length; i++)
	   {
	       if(arr[i]==value) break;
	   }
           if(i==n)  System.out.println("Element not found");
	   else System.out.println("Element found at position:"+(i+1));
	}
}