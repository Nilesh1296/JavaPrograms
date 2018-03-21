package com.bridgeit.datastructure;
class Node1
{
	String data;
	Node1 next;
	public Node1(String key)
	{
		data=key;
		next=null;
	}
	public void displayNode()
	{
		System.out.println("Item"+data);
	}
	
}
class LinkedList21
{
	Node1 first;
	public LinkedList21()
	{
	  first=null;
	}
	public void insert(String i)
	{
		Node1 newNode = new Node1(i);
		newNode.next=first;
		first=newNode;
	}
	public Node1 delete()
	{
		Node1 temp ;
		temp =first;
		first=first.next;
		return temp;
	}
	public void display()
	{
		Node1 current = first;
		System.out.println("this is the linkedlist element");
		while(current!=null)
		{
			current.displayNode();
			current=current.next;
		}
		System.out.println(" ");
	}
	public boolean isEmpty()
	{
		Node1 current = first;
		if(current==null)
		{
			return true;
		}
		else
		{
			return false;
		}
}

public class Stack1
{
  private LinkedList21 listObj;
  public Stack1(String i)
  {
	  
  }
  public void push(String i)
  {
	  listObj.insert(i); 
  }
  public Node1 pop()
  {
	  return listObj.delete();
  }
  public void displayStack()
  {
	  System.out.println("Stack:" );
	  listObj.display();
  }
  public boolean isEmpty()
  {
	  return listObj.isEmpty();
  }
  
}


}
