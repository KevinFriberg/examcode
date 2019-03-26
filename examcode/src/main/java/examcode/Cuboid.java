package examcode;

public class Cuboid extends Rectangle {

	private int Length;
	private int Width;
	private int Depth;
	
	public Cuboid()
	{
		
	}

	public Cuboid(int length, int width, int depth) {
		super();
		Length = length;
		Width = width;
		Depth = depth;
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
			throw new IllegalArgumentException("width must be a positive number");
	}

	public int getDepth() {
		return Depth;
	}

	public void setDepth(int depth) {
		Depth = depth;
			if (depth <= 0);
			throw new IllegalArgumentException("depth must be a positive number");
	}
	
	
}
