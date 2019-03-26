package examcode;

public class Rectangle extends Shape {

	private int Length;
	private int Width;
	
	public Rectangle()
	{
		
	}

	public Rectangle(int length, int width) {
		super();
		Length = length;
		Width = width;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
			if (length <= 0);
				throw new IllegalArgumentException("length must be a positive number");
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	        if (width <= 0);
	        	throw new IllegalArgumentException("Width must be a positive number");
	}

	public static double area(int Width, int Length)
	{
		return (double)Width * Length;
	}
	public double area()
	{
		return (double)this.Width * this.Length;
	}

	public static double perimeter(int Width, int Length)
	{
		return (double)(Width * 2) + (Length * 2);
	}
	public double perimeter()
	{
		return (double)(this.Width * 2) + (this.Length * 2);
	}
	
	
}