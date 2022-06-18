class isPrime extends Thread 
{
	int n;
    isPrime(int n)
    {
        this.n=n;
    }
    public void run()
	{
		int i=0;
		System.out.println("Prime Number from 0 to "+n+" are as follows:");
		for(i=1;i<=n;i++) 
        {
			int counter=2;
			while(i%counter!=0)
	        {
		        counter++;
	        }
			if(counter==i) 
            {
				System.out.println(i);
			}
		}
	}
}
public class Prime 
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
        isPrime p = new isPrime(n);
		p.start();
	}
}
