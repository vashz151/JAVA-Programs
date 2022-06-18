import java.io.*;
class MarksOutOfBoundsException extends Exception
{
    MarksOutOfBoundsException()
    {
        System.out.println("Marks out of range");
    }
}
class ExMarks 
{
    public static void main(String[] args) throws IOException
    {
        int marks;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter marks:");
        marks=Integer.parseInt(br.readLine());
        try
        {  
            if(marks<0 || marks>100) throw new MarksOutOfBoundsException();   
        }
        catch(MarksOutOfBoundsException e)
        {
            System.out.println("Exception:"+e);
        }
    }
}