class CubeOfDigits
{
	public static void main(String args[])
	{
		int n,d,sum=0;
		n=Integer.parseInt(args[0]);
		while(n!=0)
		{
			d=n%10;
			sum=sum+d*d*d;
			n=n/10;
		}
		System.out.println("Sum of cube of digits="+sum);
	}
}