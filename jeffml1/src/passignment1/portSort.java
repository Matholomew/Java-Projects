package passignment1;

import java.util.Comparator;

/**
 * Does a comparator sort on NZ Port
 * @author Matthew
 *
 */
public class portSort implements Comparator<PaperExports>{

	@Override
	public int compare(PaperExports o1, PaperExports o2) {
		// TODO Auto-generated method stub
		return o1.getnZPort().compareTo(o2.getnZPort());
	}

}
