class Count{
    static int counter = 0;
    Count()
    {
        counter++;
    }
    public static void main(String[] args)
    {  
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();
        System.out.println("Number of objects created="+counter); 
    }
}

