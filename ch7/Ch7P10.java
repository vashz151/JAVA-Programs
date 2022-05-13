import java.io.*;
class MonthNumberOutOfBounds extends Exception
{
	public MonthNumberOutOfBounds(String str)
	{
		System.out.println(str);
	}
}
class Ch7P10
{
    	public static void main(String args[]) throws IOException
    	{
		int m;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a month number:");
		try
		{
			m=Integer.parseInt(br.readLine());		
			if(m>12 || m<1) throw new MonthNumberOutOfBounds("Invalid Month Number");
		}
		catch(MonthNumberOutOfBounds ae)
		{
		}
	}
}