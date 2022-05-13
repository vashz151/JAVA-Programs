import java.io.*;
class Ch7P4
{
    	public static void main(String args[])throws IOException
    	{
		int divid,divis,quot;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter dividend and divisor:");
		try
		{
			divid=Integer.parseInt(br.readLine());
			divis=Integer.parseInt(br.readLine());
			quot=divid/divis;
			System.out.println("Quotient="+quot);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Please enter integers");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divisor entered is zero");
		}

	}
}