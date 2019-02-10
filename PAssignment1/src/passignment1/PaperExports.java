package passignment1;

import java.io.File;
import java.util.Scanner;

public class PaperExports {
	
	private int year;
	private String quarter;
	private String country;
	private String nZPort;
	private String productType;
	private double exportQuantity;
	
	public PaperExports()
	{
		
	}
	
	public void read() {
		try {
			Scanner scanner = new Scanner(new File("ProductionOfPaper.csv"));
			  scanner.useDelimiter(",");
			  while(scanner.hasNext()){
		            System.out.print(scanner.next()+"|");
		            country = scanner.next();
		        }
		        scanner.close();
		} catch (Exception e) {
			System.out.println("Failed creating Scanner from File");
		}
	}
	
	public void sort()
	{
		
	}
	
	public void search()
	{
		
	}
	
	public void calculate()
	{
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getnZPort() {
		return nZPort;
	}

	public void setnZPort(String nZPort) {
		this.nZPort = nZPort;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public double getExportQuantity() {
		return exportQuantity;
	}

	public void setExportQuantity(double exportQuantity) {
		this.exportQuantity = exportQuantity;
	}
	
	
}
