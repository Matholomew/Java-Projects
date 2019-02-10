package passignment1;

import java.util.Comparator;

/**
 * Does a comparator sort on Export Quantity
 * @author Matthew
 *
 */
public class exportQuantitySort implements Comparator<PaperExports>{

	@Override
	public int compare(PaperExports o1, PaperExports o2) {
		// TODO Auto-generated method stub
		return o1.getExportQuantity() - o2.getExportQuantity();
	}

}
