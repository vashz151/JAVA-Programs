import java.util.*;
public class Ch3P5
{
	public static void main(String args[])
	{
		int i,n,xiyi=0,xi=0,yi=0,xi2=0;
		float m,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of points:");
		n=sc.nextInt();
		int x[]=new int[n];
		int y[]=new int[n];
		for(i=0;i<=n-1;i++)
		{
			System.out.println("Enter x and y co-ordinates:");
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
			xi=xi+x[i];
			yi=yi+y[i];
			xiyi+=(x[i]*y[i]);
			xi2+=(x[i]*x[i]);
		}
		m=(n*xiyi-xi*yi)/(n*xi2-xi*xi);
		c=(yi-m*xi)/n;
		System.out.println("Equation of line: y="+m+"x+"+c);
	}
}