class Generic2
{
	static <T> void genericDisplay (T element)
	{
		System.out.println(element.getClass().getName() +" = " + element);
	}
	public static void main(String[] args)
	{
		genericDisplay(15);
		genericDisplay("Hello World");
		genericDisplay(2.0);
	}
}
