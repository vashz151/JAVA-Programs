import java.io.*;
class Ch7P3
{
    	public static void main(String args[])throws IOException
    	{
		int divid=0,divis=0,quot;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter dividend and divisor:");
		try
		{
			divid=Integer.parseInt(br.readLine());
			divis=Integer.parseInt(br.readLine());
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Please enter integers");
		}
		try
		{
			quot=divid/divis;
			System.out.println("Quotient="+quot);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divisor entered is zero");
		}

	}
}