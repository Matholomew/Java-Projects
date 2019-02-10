package passignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
/**
 * This class reads a csv file and fills that data into the PaperExports class
 * @author Matthew
 *
 */
public class BaseReader {

	public BaseReader() {
		
	}
	
	/**
	 * Reads the appropriate data from the file and adds to PaperExports array list
	 * @param exports Exports array given form the ExportsApp class
	 */
	public static void read(ArrayList<PaperExports> exports) {
		int year;
		String quarter;
		String country;
		String nZPort;
		String productType;
		int exportQuantity;
		String line;
		int count =0;
		
		try {
			BufferedReader scanner = new BufferedReader(new FileReader("ProductionOfPaper.csv"));
			  while((line = scanner.readLine()) != null){
				  if(count != 0){
				  String[] fields = line.split(",");
				  year = Integer.parseInt(fields[0]);
				  quarter=fields[1];
				  country=fields[2];
				  nZPort=fields[3];
				  productType=fields[4];
				  exportQuantity=Integer.parseInt(fields[5]);
				  exports.add(new PaperExports(year, quarter, country, nZPort, productType, exportQuantity));
				  }
				  count++;
		        }
		        scanner.close();
		} catch (Exception e) {
			System.out.println("Failed creating Scanner from File");
		}
	}
}
