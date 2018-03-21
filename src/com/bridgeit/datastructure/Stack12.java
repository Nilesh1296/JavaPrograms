package com.bridgeit.datastructure;

import java.util.*;

/*  Class arrayStack  */
class Stack12
{
    protected int arr[];
    protected String arr1[];
    protected int top, size, len;
    /*  Constructor for arrayStack */
    public Stack12(int n)
    {
    	
        size = n;
        len = 0;
        arr = new int[size];
        
        top = -1;
    }
  public Stack12(String str)
    {
	  String[] Str=str.split(" ");
	  int size =Str.length;
      len = 0;
      arr1 = new String[size];
      top = -1;
    }
    public Stack12() {
		// TODO Auto-generated constructor stub
	}
	/*  Function to check if stack is empty */
    public boolean isEmpty()
    {
        return top == -1;
    }
    /*  Function to check if stack is full */
    public boolean isFull()
    {
        return top == size -1 ;        
    }
    /*  Function to get the size of the stack */
    public int getSize()
    {
        return len ;
    }
    /*  Function to check the top element of the stack */
    public int peek()
    {
        if( isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return arr[top];
    }
    public String peek1()
    {
        if( isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return arr1[top];
    }
    
    /*  Function to add an element to the stack */
    public void push(int i)
    {
        if(top + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        if(top + 1 < size )
            arr[++top] = i;
        len++ ;
    }
   
    /*  Function to delete an element from the stack */
    public int pop()
    {
        if( isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        len-- ;
        return arr[top--]; 
    }    
    /*  Function to display the status of the stack */
    public void display()
    {
        System.out.print("\nStack = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
	public void push(char str) 
	{
		if(top + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        if(top + 1 < size )
            arr[++top] = str;
        len++ ;
		
	}   
	public void push(String str) 
	{
		if(top + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        if(top + 1 < size )
            arr1[++top] = str;
        len++ ;
		
	}
	public String getData()
	{
		
		return null;
	}   
	
	
}