import java.util.*;
class TypeCast1
{
	public static void main(String args[])
	{
		int x;
		float y;
		y=Float.parseFloat(args[0]);
		x=(int)y;
		System.out.println("Integer part is:"+x);
	}
}