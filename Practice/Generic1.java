class Test<T, U>
{
	T obj1; 
	U obj2;
	Test(T obj1, U obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public void print()
	{
		System.out.println(obj1+" "+obj2);
	}
}
class Generic1
{
	public static void main (String[] args)
	{
		Test <Integer, String> obj =new Test<Integer, String>(15,"Hello");
		obj.print();
	}
}
