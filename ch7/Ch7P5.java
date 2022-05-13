import java.io.*;
class Ch7P5
{
    	public static void main(String args[])
    	{
		int divid=0,divis=0,quot;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter dividend and divisor:");
		try
		{
			divid=Integer.parseInt(br.readLine());
			divis=Integer.parseInt(br.readLine());
			quot=divid/divis;
			System.out.println("Quotient="+quot);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divisor entered is zero");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Please enter integers");
		}
		catch(IOException nfe)
		{
			System.out.println("IO");
		}
	}
}