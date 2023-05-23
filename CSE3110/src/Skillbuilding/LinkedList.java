package Skillbuilding;

public class LinkedList 
{
	private Node head;


	
	
	public LinkedList()
	{
		head = null;

	}
	
	//Adds a node to the linked list
	public void addAtFront(String str)
	{
		Node newNode = new Node(str);
		newNode.setNext(head);
		head = newNode;
	}
	
	//Deletes a node in the linked list
	//The first node containing "str" has been deleted
	public void remove(String str)
	{
		Node current = head;
		Node previous = head;
		
		if(current.getData().equals(str))
		{
			head = current.getNext();
		}
		else
		{
			while(current.getNext() != null)
			{
				previous = current;
				current = current.getNext();
				if(current.getData().equals(str))
				{
					previous.setNext(current.getNext());
				}
			}
		}
	}
	
	//Returns the number of items in the list
	public int size()
	{
		Node current = head;
		int count = 0;
		
		if(current != null)
		{
			count += 1;
			while(current.getNext() != null)
			{
				current = current.getNext();
				count += 1;
			}
			return count;
		}
		else
		{
			return 0;
		}
		
	}
	
	public String toString() 
	{
		Node current = head;
		String listString;
		
		if (current != null) 
		{
			listString = current.getData() + "\n";
			while (current.getNext() != null) 
			{
				current = current.getNext();
				listString += current.getData() + "\n";
			}
			return(listString);
		} 
		else 
		{
			return("There are no items in list." + "\n");
		}
	}
	

	
	//addAtEnd() will add a new node to the end of the list  
    public void addAtEnd(String str) {  
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
    
    public void makeEmpty(String str) {
    	
         head = null;
    	
    }

    
    

}