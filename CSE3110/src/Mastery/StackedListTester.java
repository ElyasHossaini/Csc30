package Mastery;

public class StackedListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackList stack = new StackList();
		
		stack.push("Blue");
		stack.push("Green");
		stack.push("Yellow");
		System.out.println(stack.toString());
		System.out.println("The top item in the stack is: " + stack.getTop());
		
		System.out.println("Removing the top item");
		stack.pop();
		System.out.println(stack.toString() + "\n");
		System.out.println("Removing all items");
		stack.makeEmpty();
		System.out.println(stack.toString() + "\n");
		
		stack.push("Red");
		System.out.println("New item being added.");
		System.out.println(stack.toString());
	}

}
