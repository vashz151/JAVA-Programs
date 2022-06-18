import java.util.*;
class e12p2 
{
    static int i,n,a[],min,max;
    static float avg;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter numbers:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }    
        min=a[0];
        max=a[0];
        avg av=new avg();
        min m=new min();
        max m1=new max();
        Thread t=new Thread(av);
        Thread t1=new Thread(m);
        Thread t2=new Thread(m1);
        t.start();
        t1.start();
        t2.start();
        if(t.isAlive() || t1.isAlive() || t2.isAlive())
        try
        {
            Thread.sleep(100);
        }
        catch(Exception e){}
        System.out.println("The average value is = "+avg+"\nThe minimum value is = "+min+"\nThe maximum value is = "+max);
    } 
}
class avg extends e12p2 implements Runnable
{
    public void run()
    {
        for(i=0;i<n;i++)
        {
            avg+=a[i];
        }
        avg=avg/n;
    }
}
class min extends e12p2 implements Runnable
{
    public void run()
    {
        for(i=0;i<n;i++)
        {
            if(a[i]<min) min=a[i];
        }
    }
}
class max extends e12p2 implements Runnable
{
    public void run()
    {
        for(i=0;i<n;i++)
        {
            if(a[i]>max) max=a[i];
        }
    }
}