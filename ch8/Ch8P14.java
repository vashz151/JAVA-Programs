class A implements Runnable
{
	public void run()
	{
		int i;
		synchronized (this)
		{
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
}
class Ch8P14
{
	public static void main(String args[])
	{
		A n=new A();
		Thread t1=new Thread(n);
		Thread t2=new Thread(n);
		t1.start();
		t2.start();
	}
}