package pbox;

public class Box {
	
	private double height;
	private double width;
	private double length;
	
	public Box(double height, double width, double length) 
	{
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	public Box(double squareBase, double height)
	{
		this.height = height;
		length = width = squareBase;
	}
	
	public Box(double side) 
	{
		height = width = length = side;
	}
	
	public double getWidth() 
	{
		return width;
	}
	
	public double getLength() 
	{
		return length;
	}
	
	public double getHeight() 
	{
		return height;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public double calcVolume() 
	{
		return width * length * height;
	}
	
	public double getSurface()
	{
		return 2 * length * width + 2 * length * height + 2 * width * height; 
	}
	
	public String toString()
	{
		return "height is " + height + "\n" + 
		"width is " + width + "\n" + 
		"length is " + length + "\n";
	}
}
