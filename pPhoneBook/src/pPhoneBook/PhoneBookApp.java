package pPhoneBook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class PhoneBookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Person> people = new ArrayList();
		String line = "";
		try {
		BufferedReader in = new BufferedReader(new FileReader("Phone.csv"));
		while((line = in.readLine()) != null)
		{
			String[] fields = line.split(",");
			String firstName = fields[0];
			String lastName = fields[1];
			String room = fields[2];
			String title = fields[3];
			String phone = fields[4];
			people.add(new Person(firstName, lastName, room, title, phone));
		}
		}
		catch(Exception e) {
			System.out.println("File not found error");
		}
		for (Person peeps : people)
		{
			System.out.println(peeps);
		}
	}
}
