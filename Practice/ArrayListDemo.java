import java.util.*;
class ArrayListDemo 
{
	public static void main(String[] arg)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Water Bottle");
		list.add("Bowl");
		list.add("Plates");
		list.add("Spoons");
		list.add("Bag");
        System.out.println("Shopping cart list is:"+list);
		list.remove(1);
        //user bought bowl so removing it
		System.out.println("Removing bowl from the list "+list);
        //User wants to replace bag with shoes
        System.out.println("Adding shoes instead of bag "+ list.set(3,"Shoes"));
        System.out.println("Updated List is: "+list);
	}
}
