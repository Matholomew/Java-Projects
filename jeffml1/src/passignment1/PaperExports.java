package passignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * This class manipulates all of the Paper Exports data
 * @author Matthew
 *
 */
public class PaperExports implements Comparable<PaperExports>{
	/**
	 * The following fields hold the export data 
	 */
	private int year;
	private String quarter;
	private String country;
	private String nZPort;
	private String productType;
	private int exportQuantity;
	
	public PaperExports(int year, String quarter, String country, String nZPort, String productType, int exportQuantity)
	{
		this.year = year;
		this.quarter = quarter;
		this.country = country;
		this.nZPort = nZPort;
		this.productType = productType;
		this.exportQuantity = exportQuantity;
	}
	
	/**
	 * Does a comparator sort on NZ Ports
	 * @param myArray Exports array given from the AssignmentGui class
	 */
	public static void nZSort(ArrayList<PaperExports> myArray)
	{
		portSort ports = new portSort();
		Collections.sort(myArray, ports);
	}
	
	/**
	 * Does a comparator sort on Country
	 * @param myArray Exports array given from the AssignmentGui class
	 */
	public static void countrySort(ArrayList<PaperExports> myArray)
	{
		countrySort countrySorts = new countrySort();
		Collections.sort(myArray, countrySorts);
	}
	
	/**
	 * Does a comparator sort on Export Quantity
	 * @param myArray Exports array given from the AssignmentGui class
	 */
	public static void exportQuantitySort(ArrayList<PaperExports> myArray)
	{
		exportQuantitySort exportQuantitys = new exportQuantitySort();
		Collections.sort(myArray, exportQuantitys);
	}
	
	/**
	 * Does a comparator sort on Product Type
	 * @param myArray Exports array given from the AssignmentGui class
	 */
	public static void productTypeSort(ArrayList<PaperExports> myArray)
	{
		prodTypeSort productSorts = new prodTypeSort();
		Collections.sort(myArray, productSorts);
	}
	
	/**
	 * Does a comparator sort on Year
	 * @param myArray Exports array given from the AssignmentGui class
	 */
	public static void yearSort(ArrayList<PaperExports> myArray)
	{
		yearSort yearSorts = new yearSort();
		Collections.sort(myArray, yearSorts);
	}
	
	/**
	 * Does a comparator sort on Quarter
	 * @param myArray Exports array given from the AssignmentGui class
	 */
	public static void quarterSort(ArrayList<PaperExports> myArray)
	{
		quarterSort quarterSorts = new quarterSort();
		Collections.sort(myArray, quarterSorts);
	}
	
	/**
	 * Finds the mode of the year
	 * @param myArray Exports array given from the AssignmentGui class
	 * @return Returns the mode of given array
	 */
	public static int yearModeSort(ArrayList<PaperExports> myArray)
	{
		yearSort years = new yearSort();
		Collections.sort(myArray, years);
		
		int max=0, maxCount=0;
		int length=myArray.size();
		for (int i = 0; i <length; ++i) {
		int count = 0;
		for (int j = 0; j <length; ++j) {
		if (myArray.get(j).getYear() == myArray.get(i).getYear()) ++count;
		}
		if (count > maxCount)
		{
		maxCount = count;
		max = myArray.get(i).getYear();
		}
		}
		System.out.println(max);
		return max;

	}
	
	/**
	 * Finds the mode of the Export Quantity
	 * @param myArray Exports array given from the AssignmentGui class
	 * @return Returns the mode of the given array
	 */
	public static int expQuanModeSort(ArrayList<PaperExports> myArray)
	{
		exportQuantitySort years = new exportQuantitySort();
		Collections.sort(myArray, years);
		
		int max=0, maxCount=0;
		int length=myArray.size();
		for (int i = 0; i <length; ++i) {
		int count = 0;
		for (int j = 0; j <length; ++j) {
		if (myArray.get(j).getExportQuantity() == myArray.get(i).getExportQuantity()) ++count;
		}
		if (count > maxCount)
		{
		maxCount = count;
		max = myArray.get(i).getExportQuantity();
		}
		}
		return max;

	}
	
	/**
	 * Finds the median of the Year
	 * @param myArray Exports array given from the AssignmentGui class
	 * @return Returns the median of the given array
	 */
	public static int medianYearSort(ArrayList<PaperExports> myArray) {
		yearSort years = new yearSort();
		Collections.sort(myArray, years);
		
		double median;
		if (myArray.size() % 2 == 0)
		    median = ((double)myArray.get(myArray.size()/2).getYear() + (double)myArray.get(myArray.size()/2 - 1).getYear())/2;
		else
		    median = (double) myArray.get(myArray.size()/2).getYear();
		return (int) median;
	}
	
	/**
	 * Finds the median of the Export Quantity
	 * @param myArray Exports array given from the AssignmentGui class
	 * @return Returns the median of the given array
	 */
	public static int medianExpQuanSort(ArrayList<PaperExports> myArray) {
		exportQuantitySort years = new exportQuantitySort();
		Collections.sort(myArray, years);
		
		int median;
		if (myArray.size() % 2 == 0)
		    median = myArray.get(myArray.size()/2).getExportQuantity() + myArray.get(myArray.size()/2 - 1).getExportQuantity()/2;
		else
		    median = myArray.get(myArray.size()/2).getExportQuantity();
		return median;
	}
	
	/**
	 * Finds the mean of the Year
	 * @param myArray Exports array given from the AssignmentGui class
	 * @return Returns the mean of the given array
	 */
	public static int meanYearSort(ArrayList<PaperExports> myArray) {
	    int sum = 0;
	    for (int i = 0; i < myArray.size(); i++) {
	        sum +=  myArray.get(i).getYear();
	    }
	    return (sum / myArray.size());
	}
	
	/**
	 * Finds the mean of the Export Quantity
	 * @param myArray Exports array given from the AssignmentGui class
	 * @return Returns the mean of the given array
	 */
	public static int meanExpQuanSort(ArrayList<PaperExports> myArray) {
	    int sum = 0;
	    for (int i = 0; i < myArray.size(); i++) {
	        sum +=  myArray.get(i).getExportQuantity();
	    }
	    return (sum / myArray.size());
	}
	
	/**
	 * Finds the minimum of the Year
	 * @param myArray Exports array given from the AssignmentGui class
	 * @return Returns the minimum of the given array
	 */
	public static int findMinYear(ArrayList<PaperExports> myArray) 
	{
		int smallest = myArray.get(0).getYear();
        int largest = myArray.get(0).getYear();
        
		for(PaperExports num : myArray)
		{
			 if(num.getYear() > largest)
                 largest = num.getYear();
         else if (num.getYear() < smallest)
                 smallest = num.getYear();	
		}
		return smallest;
	}
	
	/**
	 * Finds the minimum of the Export Quantity
	 * @param myArray Exports array given from the AssignmentGui class
	 * @return Returns the minimum of the given array
	 */
	public static int findMinExpQuan(ArrayList<PaperExports> myArray) 
	{
		int smallest = myArray.get(0).getExportQuantity();
        int largest = myArray.get(0).getExportQuantity();
        
		for(PaperExports num : myArray)
		{
			 if(num.getExportQuantity() > largest)
                 largest = num.getExportQuantity();
         else if (num.getExportQuantity() < smallest)
                 smallest = num.getExportQuantity();	
		}
		return smallest;
	}
	
	/**
	 * Finds the maximum of the Export Quantity
	 * @param myArray Exports array given from the AssignmentGui class
	 * @return Returns the maximum of the given array
	 */
	public static int findMaxExpQuan(ArrayList<PaperExports> myArray)
	{
		int smallest = myArray.get(0).getExportQuantity();
        int largest = myArray.get(0).getExportQuantity();
        
		for(PaperExports num : myArray)
		{
			 if(num.getExportQuantity() > largest)
                 largest = num.getExportQuantity();
         else if (num.getExportQuantity() < smallest)
                 smallest = num.getExportQuantity();	
		}
		return largest;
	}
	
	/**
	 * Finds the maximum of the Year
	 * @param myArray Exports array given from the AssignmentGui class
	 * @return Returns the maximum of the given array
	 */
	public static int findMaxYear(ArrayList<PaperExports> myArray) 
	{
		int smallest = myArray.get(0).getYear();
        int largest = myArray.get(0).getYear();
        
		for(PaperExports num : myArray)
		{
			 if(num.getYear() > largest)
                 largest = num.getYear();
         else if (num.getYear() < smallest)
                 smallest = num.getYear();	
		}
		return largest;
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

	public int getExportQuantity() {
		return exportQuantity;
	}

	public void setExportQuantity(int exportQuantity) {
		this.exportQuantity = exportQuantity;
	}



	@Override
	public int compareTo(PaperExports o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
