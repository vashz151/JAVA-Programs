class Al extends Thread
{
    Thread t;
    public Al(String str)
    {
        t=new Thread(this,str);
        t.start();
    }
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            try
            {
                sleep(10);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class Alive 
{
    public static void main(String args[])
    {
        Al a1=new Al("Thread 1");
        Al a2=new Al("Thread 2");
        Al a3=new Al("Thread 3");
        System.out.println("Status of "+a1.t+"="+a1.t.isAlive());
        System.out.println("Status of "+a2.t+"="+a2.t.isAlive());
        System.out.println("Status of "+a3.t+"="+a3.t.isAlive());
        try {
            a1.t.join();
            a2.t.join();
            a3.t.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Status of "+a1.t+"="+a1.t.isAlive());
        System.out.println("Status of "+a2.t+"="+a2.t.isAlive());
        System.out.println("Status of "+a3.t+"="+a3.t.isAlive());
    }    
}
