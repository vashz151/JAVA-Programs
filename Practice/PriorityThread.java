class eg implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread());
    }
}
public class PriorityThread
{
    public static void main(String args[])
    {
        eg e=new eg();
        Thread t=new Thread(e,"New Thread");
        System.out.println("Priority of Thread:"+t.getPriority());
        System.out.println("Name of the thread:"+t.getName());
        t.start();
    }
}