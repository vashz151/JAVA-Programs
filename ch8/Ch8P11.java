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
class Alphabets implements Runnable
{
	public void run()
	{
		int i;
		for(i=1;i<=26;i++)
		{
			System.out.println((char)(i+64));
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
class Ch8P11
{
	public static void main(String args[])
	{
		Numbers n=new Numbers();
		Alphabets n1=new Alphabets();	
		Thread t1=new Thread(n);
		Thread t2=new Thread(n1);
		t1.start();
		t2.start();
		System.out.println("Thread t1 is alive:"+t1.isAlive());
		System.out.println("Thread t2 is alive:"+t2.isAlive());
		try
		{
			t1.join();
			t2.join();
		}
		catch(InterruptedException ie)
		{
		}
		System.out.println("Thread t1 is alive:"+t1.isAlive());
		System.out.println("Thread t2 is alive:"+t2.isAlive());
	}
}