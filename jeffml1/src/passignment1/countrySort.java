package passignment1;

import java.util.Comparator;

/**
 * Does a comparator sort on the Country
 * @author Matthew
 *
 */
public class countrySort implements Comparator<PaperExports>{

	@Override
	public int compare(PaperExports o1, PaperExports o2) {
		// TODO Auto-generated method stub
		return o1.getCountry().compareTo(o2.getCountry());
	}

}
