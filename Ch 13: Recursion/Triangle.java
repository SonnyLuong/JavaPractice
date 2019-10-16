/**
	
*/
public class Triangle
{
	private int width;
	/**
		Constructs a triangular shape
		@param aWidth the width and height of the triangle
	*/
	public Triangle(int awidth)
	{
		width = awidth;
	}
	public int getArea()
	{
		if (width <= 0) { return 0;}
		else if (width == 1) {return 1;}
		else 
		{
			Triangle smallerTriangle = new Triangle(width - 1);
			int smallerArea = smallerTriangle.getArea();
			return smallerArea + width;
		}
	}
}
