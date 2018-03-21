/******************************************************************************
  
 *  Purpose: Read .a List of Numbers from a file and arrange it ascending Order
 *  in a Linked List.Take user input for a number, if found then pop the number
 *  out of the list else insert the number in appropriate position

 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   08-03-2017
 *
 ******************************************************************************/

package com.bridgeit.datastructure;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import com.bridgeit.utility.Utility;
public class Orderedlist {
	

	
	public static void main(String[] args) throws IOException 
	{
		LinkedList1 ll= new LinkedList1();
		Utility utility = new Utility();
		File file = new File("abcd.text");
		file.createNewFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader buffer = new BufferedReader(fileReader);
		String line = buffer.readLine();
		System.out.println(line);
		String array[] = line.split(" ");
		int a[]=new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			a[i]=Integer.parseInt(array[i]);
		}
		System.out.println("The sorted list array are");
		for (int i = 0; i <a.length; i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			System.out.print(a[i]+" ");
			
		}
		System.out.println("The linked list sort array are");
		for(int i=0;i<array.length;i++)
		{
			ll.add(array[i]);
		}
		System.out.println("Enter the number to be search");
		String searchNumber = utility.inputString();
		boolean status=ll.search(searchNumber);
		System.out.print(status+" ");
        LinkedList1 l3 = new LinkedList1();
	    l3= Utility.addRemove1(status, searchNumber,ll);
	    Utility.readFile1(l3, searchNumber, status, line);
	    buffer.close();
	}
		
	}

