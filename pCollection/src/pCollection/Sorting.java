package pCollection;

import java.util.ArrayList;

public class Sorting {

	public static void bubbleSort(ArrayList<Friend> myArray)
	{
		int var = 1;
		for(int i = 0; i < myArray.size() - 1; i++)
		{
			for(int j = 0; j <myArray.size() - var; j++)
			{
				if(myArray.get(j).getLastName().compareTo(myArray.get(j+1).getLastName()) > 0)
				{
					Friend temp = myArray.get(j);
					myArray.set(j, myArray.get(j+1));
					myArray.set(j+1, temp);
				}
			}
			var ++;
		}
	}
	
	public static void bubbleSortTitle(ArrayList<Book> myArray)
	{
		int var = 1;
		for(int i = 0; i < myArray.size() - 1; i++)
		{
			for(int j = 0; j <myArray.size() - var; j++)
			{
				if(myArray.get(j).getTitle().compareTo(myArray.get(j+1).getTitle()) > 0)
				{
					Book temp = myArray.get(j);
					myArray.set(j, myArray.get(j+1));
					myArray.set(j+1, temp);
				}
			}
			var ++;
		}
	}
	
	public static void bubbleSortAuthor(ArrayList<Book> myArray)
	{
		int var = 1;
		for(int i = 0; i < myArray.size() - 1; i++)
		{
			for(int j = 0; j <myArray.size() - var; j++)
			{
				if(myArray.get(j).getAuthor().compareTo(myArray.get(j+1).getAuthor()) > 0)
				{
					Book temp = myArray.get(j);
					myArray.set(j, myArray.get(j+1));
					myArray.set(j+1, temp);
				}
			}
			var ++;
		}
	}
}
