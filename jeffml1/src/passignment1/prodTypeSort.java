package passignment1;

import java.util.Comparator;

/**
 * Does a comparator sort on the Product Type
 * @author Matthew
 *
 */
public class prodTypeSort implements Comparator<PaperExports>{

	@Override
	public int compare(PaperExports o1, PaperExports o2) {
		// TODO Auto-generated method stub
		return o1.getProductType().compareTo(o2.getProductType());
	}

}
