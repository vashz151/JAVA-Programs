import java.io.*;
class Ch7P1
{
    	public static void main(String args[])throws IOException
    	{
		int divid,divis,quot;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter dividend and divisor:");
		divid=Integer.parseInt(br.readLine());
		divis=Integer.parseInt(br.readLine());
		quot=divid/divis;
		System.out.println("Quotient="+quot);
	}
}