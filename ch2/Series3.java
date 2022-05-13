import java.util.*;
class Series3
{
	public static void main(String args[])	
	{
		int i,n,fact=1, sign=-1;
		float sum,x,num,term,deg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the angle in degrees:");
		deg=sc.nextFloat();
		x=deg*3.14f/180;
		sum=term=num=x;
		for(i=3; term>=0.0000001; i+=2)
		{
			fact=fact*i*(i-1);
			num=num*x*x;
			term=num/fact;
			sum=sum+(term*sign);
			sign=sign*-1;
		}
		System.out.println("Sin "+deg+"="+sum);
		System.out.println(i);
	}
}