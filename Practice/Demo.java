class Callme
{
    void call(String msg)
    {
        System.out.print("["+msg);
        try{
            Thread.sleep(100);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("]");
    }
}
class Caller implements Runnable
{
    String msg;
    Callme target;
    Thread t;
    public Caller(Callme tg, String s)
    {
        target = tg;
        msg = s;
        t=new Thread(this);
        t.start();
    }
    public void run() 
    {
        target.call(msg);
    }
}
public class Demo{
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller obj1 = new Caller(target, "Hello");
        Caller obj2 = new Caller(target, "Synchronized");
        Caller obj3 = new Caller(target, "World");
        try{
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
