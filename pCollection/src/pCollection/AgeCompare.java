package pCollection;

import java.util.Comparator;

public class AgeCompare implements Comparator<Friend>{

	@Override
	public int compare(Friend f1, Friend f2) {
		// Integers are easiest to compare. Just subtract the second number from the first number
		if(f1.getBirthDate() != null && f2.getBirthDate() != null) {
			return f1.calculateAge() - f1.calculateAge();
		}
		else if(f1.getBirthDate() == null)
		{
			return -99;
		} 
		else
		{
			return 0;
		}
	}

	
}
