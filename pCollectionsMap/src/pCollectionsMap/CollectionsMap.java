package pCollectionsMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> myCollection = new ArrayList<String>();
		myCollection.add("i");
		myCollection.add("came");
		myCollection.add("i");
		myCollection.add("saw");
		myCollection.add("i");
		myCollection.add("conquered");
		
		HashSet<String> myHashSet = new HashSet<String>(myCollection);
		for(String key : myHashSet) {
//			System.out.println(key);
		}
		
		LinkedHashSet<String> linkHash = new LinkedHashSet<String>();
		linkHash.addAll(myCollection);
		for(String key : linkHash) {
//			System.out.println(key);
		}
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.addAll(myCollection);
		for(String key : treeSet) {
//			System.out.println(key);
		}
		
		ArrayList<String> myCollection2 = new ArrayList<String>();
		myCollection2.add("i");
		myCollection2.add("came");
		myCollection2.add("i");
		myCollection2.add("saw");
		myCollection2.add("i");
		myCollection2.add("ran");
		myCollection2.add("away");
		
		TreeSet<String> treeSet2 = new TreeSet<String>();
		treeSet2.addAll(myCollection2);
		for(String key : treeSet2) {
//			System.out.println(key);
		}
		
		//Test for subsets
//		System.out.println(myCollection.containsAll(myCollection2));
		
		//find intersection without destroying original set
		Set<String> intersection = new TreeSet<String>(myCollection);
		intersection.retainAll(myCollection2);
//		System.out.println(intersection);
		
		//Find union of two sets
		Set<String> union = new TreeSet<String>(myCollection);
		union.addAll(myCollection2);
//		System.out.println(union);
		
		//find difference of two sets
		Set<String> difference = new TreeSet<String>(myCollection);
		difference.removeAll(myCollection2);
//		System.out.println(difference);
		
		Book book1 = new Book("Rachel's Legacy", "Thomas, Julie");
		Book book2 = new Book("Bulibasha", "Ihimaera, Witi");
		Book book3 = new Book("Chappy", "Grace, Patricia");
		Book book4 = new Book("Wild Pork and Watercress", "Crump, Barry");
		Book book5 = new Book("The invisible Mile", "Coventry, David");
		Book book6 = new Book("Dad Art", "Wilkins, Damien");
		Book book7 = new Book("Th Antipodeans", "McGee, Greg");
		Book book8 = new Book("Absence", "King, Joanna");
		Set<Book> library = new TreeSet<Book>();
		library.add(book1);
		library.add(book2);
		library.add(book3);
		library.add(book4);
		library.add(book5);
		library.add(book6);
		library.add(book7);
		library.add(book8);
		for(Book key : library) {
			System.out.println(key);
		}
		Book book9 = new Book("Taken", "O'Callagan, Sue");
		Book book10 = new Book("Taken", "Crais, Robert");
		for(int i = 0; i < library.size(); i++) {		//Needs to display all books
//			System.out.println(library.toString());
		}
		
		Map<String, Integer> vehicles = new TreeMap<String, Integer>();
		vehicles.put("Datsun", 2);
		vehicles.put("Holden", 3);
		vehicles.put("Toyota", 4);
		vehicles.put("Suzuki", 1);
//		System.out.println(vehicles);
		
		//Iterate over all vehicles using the keyset method
//		System.out.println("List of all vehicle types");
		for(String key : vehicles.keySet()) {
			System.out.println(key);
		}
		
		for(int value:vehicles.values()) {
//			System.out.println(value);
		}
		
//		String chosenVehicle = JOptionPane.showInputDialog(null, "Which vehicle would you like info on?");
		for(String key : vehicles.keySet()) {
/*			if(chosenVehicle.toUpperCase().equals(key.toUpperCase()))*/ {
//				System.out.println(key);
			}
		}
		
		String[] words = {"The", "Dad", "Fathers", "Day"};
		Map<String, Integer> wordsC = new HashMap<String, Integer>();
		for(int i = 0; i < words.length; i++) {
			if(!wordsC.containsKey(words[i])) {
				wordsC.put(words[i], i);
			}
		
		}
		System.out.println(wordsC);
		
		File file = new File("threebears.txt");
		ArrayList<String> threeBears = new ArrayList<String>();
	    try {
	        Scanner sc = new Scanner(file);
	        while (sc.hasNextLine()) {
	            String j = sc.next();
	            threeBears.add(j);
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	    System.out.println(threeBears);
	}

}
