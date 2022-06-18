import java.util.*;
class StackDemo 
{
	public static void main(String[] args)
	{
		Stack<String> stk = new Stack<String>();

		// pushing the elements
		stk.push("Hello");
		stk.push("World");
		stk.push("!!!");
        //Top of Stack
        System.out.println("The element at the top of the stack is: " + stk.peek());
 
		// Printing the Stack Elements
		System.out.println(stk);
        System.out.println("Popped element: "+ stk.pop());
 
        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation " + stk);
	}
}
