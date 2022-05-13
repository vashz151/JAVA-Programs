class ArmstrongNo
{
	public static void main(String args[])
	{
		int n,d,sum=0,copy,count=0;
		n=Integer.parseInt(args[0]);
		copy=n;
		while(copy!=0)
		{
			count++;
			copy/=10;		
		}
		copy=n;
		while(copy!=0)
		{
			d=copy%10;
			sum+=Math.pow(d,count);
			copy/=10;
		}
		if(n==sum) System.out.println("It is an Armstrong's number");
		else System.out.println("It is not an Armstrong's number");
	}
}