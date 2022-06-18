import java.util.*;
class VectorDemo 
{
	public static void main(String[] arg)
	{
		Vector<Integer> v=new Vector<Integer>();
		v.add(5);
		v.add(10);
		v.add(15);
		v.add(20);
		v.add(25);
        System.out.println("Vector is:"+v);
		v.remove(1);
		System.out.println("After removing 10 from vector: "+v);
        System.out.println("The Object that is replaced is "+ v.set(3, 21)+" and new value is: "+v.get(3));
	}
}
