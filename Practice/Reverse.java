import java.util.StringTokenizer;
public class Reverse
{
    public static void main(String[] args) 
    {
        String str = "This is a Test";
        StringTokenizer st = new StringTokenizer(str," ");
        String strReverse="";
        while(st.hasMoreTokens())
        {
            strReverse=st.nextToken()+" "+strReverse;
        }
        System.out.println("Reversed string by word is:"+strReverse);
    }
}