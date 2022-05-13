class A implements Runnable
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
class B implements Runnable
{
	public void run()
	{
		int i;
		for(i=11;i<=20;i++)
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
class C implements Runnable
{
	public void run()
	{
		int i;
		for(i=21;i<=30;i++)
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
class Ch8P12
{
	public static void main(String args[])
	{
		A n=new A();
		B n1=new B();	
		C n2=new C();
		Thread t1=new Thread(n);
		Thread t2=new Thread(n1);
		Thread t3=new Thread(n2);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Thread t1 is alive:"+t1.isAlive());
		System.out.println("Thread t2 is alive:"+t2.isAlive());
		System.out.println("Thread t3 is alive:"+t3.isAlive());
		try
		{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException ie)
		{
		}
		System.out.println("Thread t1 is alive:"+t1.isAlive());
		System.out.println("Thread t2 is alive:"+t2.isAlive());
		System.out.println("Thread t3 is alive:"+t3.isAlive());
	}
}