package parraylist;

import java.util.ArrayList;

public class ArrayListApp {

	public static void main(String[] args) {
		// Main app method
		
		ArrayList<String> family = new ArrayList<String>();
		family.add("Josh");
		 family.add("Ben");
		 family.add("Issac");
		 family.add("Sam");
		 family.add("Mary");
		 int pos = family.indexOf("Sam");
		 System.out.println(pos);
		 family.remove(1);
		for(String item:family)
		{
			System.out.println(item);
		}
		System.out.println(family.get(3));
		
		//Above finished. Below needs more work
		ArrayList<Balloon> balloons = new ArrayList<Balloon>();
		balloons.add(balloons.get(1));
		for(Balloon item:balloons)
		{
			System.out.println(item.writeColour());
		}
	}

}
