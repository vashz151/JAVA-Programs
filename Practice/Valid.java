import java.io.*;
class Valid 
{
    public static void main(String[] args) throws IOException
    {
        int i=0,n,valid=0,invalid=0;
        DataInputStream ds = new DataInputStream(System.in);
        System.out.println("Enter number of integers:");
        n=Integer.parseInt(ds.readLine());
        int array[] = new int[n];
        System.out.println("Enter values:");
        while(i!=n) 
        {
            try 
            {
                array[i]=Integer.parseInt(ds.readLine());
                valid++;
            }
            catch (Exception e) 
            {
                invalid++;
                System.out.println(e);
            }
            finally
            {
                i++;
            }
        }
        System.out.println("Valid:"+valid+"\nInvalid:"+invalid);
    }
}