package pCollection;

import java.util.Comparator;

public class GenderSort implements Comparator<Friend>{

	@Override
	public int compare(Friend f1, Friend f2) {
		// TODO Auto-generated method stub
		return Character.compare(f1.getGender(), f2.getGender());
	}

}
