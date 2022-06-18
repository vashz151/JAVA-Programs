import java.util.*;
abstract class Book
{
    String title;
    abstract void setTitle(String s);
    String getTitle()
    {
        return title;
    }
}
class New extends Book
{
	void setTitle(String s)
	{
        title=s;
	}
}
public class Abstract
{
	public static void main(String args[])
	{
		New n=new New();
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter title:");
		str=sc.nextLine();
		n.setTitle(str);
		System.out.println("The title is:"+n.getTitle());
	}
}