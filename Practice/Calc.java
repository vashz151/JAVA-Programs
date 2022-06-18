import java.util.*;
public class Calc
{
	public static void main(String args[])
	{
	   int i,n,sum=0;
	   float mean,sum1=0,sd=0;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number of elements:");
	   n=sc.nextInt();
	   int arr[]=new int[n];
	   System.out.println("Enter elements:");
	   for(i=0;i<n;i++)
	   {
	       arr[i]=sc.nextInt();
	       sum+=arr[i];
	   }
	   mean=(float)sum/n;
	   for(i=0;i<n;i++)
	   {
	       sum1+=(arr[i]-mean)*(arr[i]-mean);
	   }
	   sd=(float)Math.sqrt(sum1/n);
	   System.out.println("Mean="+mean+"\nStandard Deviation="+sd);
	   System.out.println("Variance="+(sd*sd));
	}
}