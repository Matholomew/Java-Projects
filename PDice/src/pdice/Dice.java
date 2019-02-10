package pdice;
import java.util.Random;

public class Dice {
	private final int MAX = 6;
	private int faceValue;
	
	public Dice() 
	{
		faceValue = 1;
	}
	
	public int roll()
	{
		Random randomGenerator = new Random();
		faceValue = randomGenerator.nextInt(MAX);
		return faceValue;
	}
	
	public void setFaceValue(int value)
	{
		faceValue = value;
	}
	
	public int getFaceValue()
	{
		return faceValue;
	}
	
	public String toString()
	{
		return Integer.toString(faceValue);
	}
}
