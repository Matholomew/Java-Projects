package parraylist;

import java.util.Random;

public class Balloon {

	private int colour;
	
	public Balloon() {
		Random rand = new Random();
		colour = rand.nextInt(10);
		
	}
	
	public int getColour() 
	{
		return colour;
	}
	
	public String writeColour()
	{
		String colourString;
		switch(colour)
		{
		case 1:
			colourString = "Red";
			break;
		case 2:
			colourString = "Blue";
			break;
		case 3:
			colourString = "Orange";
			break;
		case 4:
			colourString = "Yellow";
			break;
		case 5:
			colourString = "Brown";
			break;
		case 6:
			colourString = "Purple";
			break;
		case 7:
			colourString = "Green";
			break;
		case 8:
			colourString = "White";
			break;
		case 9:
			colourString = "Black";
			break;
		default:
			colourString = "";
			break;
		}
		return colourString;
	}
}
