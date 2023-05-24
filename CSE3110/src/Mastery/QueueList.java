package Mastery;

import Skillbuilding.Node;

public class QueueList {
	private Node head;
	
	public QueueList()
	{
		head = null;
	}
	
	public void addatfront(String str) 
	{
		Node newNode = new Node(str);
		newNode.setNext(head);
		head = newNode;
		
	}
	
	public void dequeue()
	{
		Node current = head;
		
		head = current.getNext();
	}
	
	public Object front()
	{
		return(head.getData());
	}
	
	public Object Top()
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
	
	public String Size()
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
			return("There are " + count + " items in the queue.");
		}
		else
		{
			return("There are "+ count + " items in the queue.");
		}
	}
	
	public void enqueue(String str) {  
        //Create a new node  
    	Node current = head;
    	  Node newNode = new Node(str);
    	   if(head == null) {
    	     head = newNode;
    	     head.setNext(null);
    	   } 
    	   else{ 
    		    //iterate to the last node
    		    while(current.getNext() != null) { 
    		    current = current.getNext(); 
    		    } 
    		    //Append the new node to the end
    		    current.setNext(newNode);  
    		}

        }  
	
	public void makeEmpty()
	{
		head = null;
	}
}
