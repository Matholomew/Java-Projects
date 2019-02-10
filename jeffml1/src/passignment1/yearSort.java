package passignment1;

import java.util.Comparator;

/**
 * Does a comparator sort on year
 * @author Matthew
 *
 */
public class yearSort implements Comparator<PaperExports>{

	@Override
	public int compare(PaperExports o1, PaperExports o2) {
		// TODO Auto-generated method stub
		return o1.getYear() - o2.getYear();
	}
	
}
