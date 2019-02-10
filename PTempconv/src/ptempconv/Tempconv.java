/*Matthew Jeffery
 * Checkpoint 2
 * */package ptempconv;

import java.text.DecimalFormat;

public class Tempconv {
	
	private double cel;
	private double fah;
	private double kel;
	
	public void setCel(double cel)
	{
		this.cel = cel;
		fah = (cel * 1.8) + 32;
		kel = cel + 273.15;
	}
	
	public void setFah(double fah)
	{
		this.fah = fah;
		cel = (fah - 32) * 5/9;
		kel = (fah - 32) * 5/9 + 273.15;
	}
	
	public void setKel(double kel)
	{
		this.kel = kel;
		fah = (kel - 273.15) * 9/5 + 32;
		cel = kel - 273.15;
	}
	
	public double getCel()
	{
		return cel;
	}
	
	public double getFah()
	{
		return fah;
	}
	
	public double getKel()
	{
		return kel;
	}
	
	public String toString()
	{
		String celcius = Double.toString(cel);
		DecimalFormat formCel = new DecimalFormat(celcius);
		String fahrenheit = Double.toString(fah);
		DecimalFormat formFah = new DecimalFormat(fahrenheit);
		String kelvin = Double.toString(kel);
		DecimalFormat formKel = new DecimalFormat(kelvin);
		return ("The temperatures are " + celcius + " celcius, " + fahrenheit + " fahrenheit and " + kelvin + " kelvin");
	}

}
