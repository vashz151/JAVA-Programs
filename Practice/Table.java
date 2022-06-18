import java.util.*;
class five extends Thread
{ 
    public void run()
    {
        long startTime=System.nanoTime();
        for(int i=0;i<=10;i++)
        {
            System.out.println("5*"+i+"="+(5*i));
        }
        long stopTime=System.nanoTime();
        long elapsedTime=stopTime-startTime;
        System.out.println("Time of five function:"+elapsedTime);
    }
}
class seven extends Thread
{ 
    public void run()
    {
        long startTime=System.nanoTime();
        for(int i=0;i<=10;i++)
        {
            System.out.println("7*"+i+"="+(7*i));
        }
        long stopTime=System.nanoTime();
        long elapsedTime=stopTime-startTime;
        System.out.println("Time of seven function:"+elapsedTime);
    }
}
class thirteen extends Thread
{ 
    public void run()
    {
        long startTime=System.nanoTime();
        for(int i=0;i<=10;i++)
        {
            System.out.println("13*"+i+"="+(13*i));
        }
        long stopTime=System.nanoTime();
        long elapsedTime=stopTime-startTime;
        System.out.println("Time of thirteen function:"+elapsedTime);
    }
}
class Table
{
    public static void main(String args[])
    {
        long startTime=System.nanoTime();
        five f=new five();
        seven s=new seven();
        thirteen t=new thirteen();
        f.start();
        s.start();
        t.start();
        long stopTime=System.nanoTime();
        long elapsedTime=stopTime-startTime;
        System.out.println("Main Function time:"+elapsedTime);
    }
}