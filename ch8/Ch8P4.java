class OddNumbers implements Runnable
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i+=2)
		{
			System.out.println(i);
		}
	}
}
class EvenNumbers implements Runnable
{
	public void run()
	{
		int i;
		for(i=2;i<=10;i+=2)
		{
			System.out.println(i);
		}
	}
}
class Ch8P4
{
	public static void main(String args[])
	{
		OddNumbers n=new OddNumbers();	
		EvenNumbers n1=new EvenNumbers();
		Thread t1=new Thread(n);
		Thread t2=new Thread(n1);
		t1.start();
		t2.start();
	}
}