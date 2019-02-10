package pCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionApp {

	public static void main(String[] args) {
		
		//Create friends and load into Friends array
		Friend f1 = new Friend("Zac", "Zebra");
		Friend f2 = new Friend("Betty", "Bart", 1978, 01, 29, 'm', "Dunedin", "fake@email,com", "Single");
		Friend f3 = new Friend("Barry", "Bart", 1990, 03, 01, 'f', "Dunedin", "fake@email,com", "Single");
		Friend f4 = new Friend("Tee", "Total");
		Friend f5 = new Friend("Adam", "Aaarvk", 1970, 01, 29, 'm', "Dunedin", "fake@email,com", "Single");
		
		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(f1);
		friends.add(f2);
		friends.add(f3);
		friends.add(f4);
		friends.add(f5);
		
		//Now to sort
		Sorting.bubbleSort(friends);
		
		Collections.sort(friends); 	//Comparable sort
		
		AgeCompare sortAge = new AgeCompare();
		Collections.sort(friends, sortAge);	//Comparator sort
		
		GenderSort genS = new GenderSort();
		Collections.sort(friends, genS);
		
		for(int i = 0; i < friends.size(); i++)
		{
			System.out.println(friends.get(i).toString());
		}
		
		
		
		Book book1 = new Book("Rachel's Legacy", "Thomas, Julie");
		Book book2 = new Book("Bulibasha", "Ihimaera, Witi");
		Book book3 = new Book("Chappy", "Grace, Patricia");
		Book book4 = new Book("Wild Pork and Watercress", "Crump, Barry");
		Book book5 = new Book("The invisible Mile", "Coventry, David");
		Book book6 = new Book("Dad Art", "Wilkins, Damien");
		Book book7 = new Book("Th Antipodeans", "McGee, Greg");
		Book book8 = new Book("Absence", "King, Joanna");
		ArrayList<Book> library = new ArrayList();
		library.add(book1);
		library.add(book2);
		library.add(book3);
		library.add(book4);
		library.add(book5);
		library.add(book6);
		library.add(book7);
		library.add(book8);
		//Sorting.bubbleSortTitle(library);
		Sorting.bubbleSortAuthor(library);
		for(int i = 0; i < library.size(); i++)
		{
			System.out.println(library.get(i).toString());
		}
		
		
	}

}
