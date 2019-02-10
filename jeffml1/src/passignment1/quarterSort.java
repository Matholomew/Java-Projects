package passignment1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

/**
 * Does a comparator sort on quarter
 * @author Matthew
 *
 */
public class quarterSort implements Comparator<PaperExports>{

	@Override
	public int compare(PaperExports o1, PaperExports o2) {
		// TODO Auto-generated method stub
		try {
			Date date = new SimpleDateFormat("MMM", Locale.ENGLISH).parse(o1.getQuarter());
			Date date1 = new SimpleDateFormat("MMM", Locale.ENGLISH).parse(o2.getQuarter());
			return date.compareTo(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 1;
		}
	}

}
