class DigitSep
{
	public static void main(String args[])
	{
		int n, d1, d2;
		n=Integer.parseInt(args[0]);
		d1=n%10;
		d2=n/10;
		System.out.println("Digit1:"+d1+"\nDigit2:"+d2);
	}
}