import java.io.*;
class Ch7P9
{
    	public static void main(String args[]) throws IOException
    	{
		int m;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a month number:");
		try
		{
			m=Integer.parseInt(br.readLine());		
			if(m>12 || m<1) throw new NumberFormatException();
		}
		catch(NumberFormatException ae)
		{
			System.out.println("Month number greater than 12");
		}
	}
}