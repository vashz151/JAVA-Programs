class Numbers implements Runnable
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
			}
		}
	}
}
class Ch8P9
{
	public static void main(String args[])
	{
		Numbers n=new Numbers();	
		Numbers n1=new Numbers();
		Thread t1=new Thread(n);
		Thread t2=new Thread(n1);
		n.run();
		//t2.start();
	}
}