package Mastery;



public class StackList {
	private Node head;
	
	public StackList()
	{
		head = null;
	}
	
	public void push(String str) 
	{
		Node newNode = new Node(str);
		newNode.setNext(head);
		head = newNode;
		
	}
	
	public void pop()
	{
		Node current = head;
		
		head = current.getNext();
	}
	
	public Object getTop()
	{
		return(head.getData());
	}
	
	public String toString()
	{
		Node current = head;
		String listString;
		
		if(current != null)
		{
			listString = "Current items are:" + "\n" + current.getData() + "\n";
			while(current.getNext() != null) {
				current = current.getNext();
				listString += current.getData() + "\n";
			}
			return(listString);
		}
		else
		{
			return("There are no items in the stack.");
		}
	}
	
	public String getSize()
	{
		Node current = head;
		int count = 0;
		
		if(current != null)
		{
			count++;
			while(current.getNext() != null)
			{
				current = current.getNext();
				count++;
			}
			return("There are " + count + " items in the stack.");
		}
		else
		{
			return("There are "+ count + " items in the stack.");
		}
	}
	
	public void makeEmpty()
	{
		head = null;
	}
}
