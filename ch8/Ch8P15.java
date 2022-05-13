class Movie implements Runnable
{
	int vacant=1,required;
	Movie(int x)
	{
		required=x;
	}
	public synchronized void run()
	{

		if(vacant>=required)
		{
			Thread x=Thread.currentThread();
			System.out.println(required+" tickets booked for "+x.getName());
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
			}
			vacant-=required;
		}
		else 
		System.out.println("Sorry no tickets for "+Thread.currentThread().getName());
	}
}
class Ch8P15
{
	public static void main(String args[])
	{
		Movie n=new Movie(1);
		Thread t1=new Thread(n);
		Thread t2=new Thread(n);
		t1.setName("Jay");
		t2.setName("Ajay");
		t1.start();
		t2.start();
	}
}