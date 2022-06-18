class Fibonacci extends Thread
{
    int n ,arr[];
    public Fibonacci (int n,int arr[])
    {
        this.n=n;
        this.arr=arr;
    }
    public void run()
    {
        try
        {
            arr[0]=0;
            arr[1]=1; 
            for (int i=2; i<=n;i++)
            {
                arr[i]=arr[i-1]+arr[i-2];
            }
        }
        catch (Exception ex)
        {}
    }
}
class Fibo
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        int arr[]=new int [n];
        Fibonacci f=new Fibonacci(n,arr);
        f.start();
        if(f.isAlive())
        try
        {
            Thread.sleep(100);
        }
        catch (Exception ex)
        {}
        System.out.println("Fibonacci series:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}