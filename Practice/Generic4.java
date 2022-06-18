import java.util.*;
class Generic4
{
	public static void main(String[] args)
	{
		ArrayList <String> list = new ArrayList<String> ();
        list.add("Hello ");
        list.add("World ");
        list.add("!");
        list.add("!");
        list.add("!");
        System.out.println(list.get(0));
        Iterator <String> itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()); //used print to get the strings in same line
        }
	}
}
