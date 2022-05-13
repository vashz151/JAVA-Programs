//Write a program to demonstrate automatic and explicit type casting
class TypeCast
{
	public static void main(String args[])
	{
		int x=10;
		float y=65.5f;
		char z;
		z=(char)y;
		y=x;
		System.out.println("y="+y+"\nz="+z);
	}
}