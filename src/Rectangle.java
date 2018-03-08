
public class Rectangle extends GeometricObject
{
	double side1, side2;
	
	/** Constructor */
	public Rectangle()
	{
		side1 = 1;
		side2 = 1;
	}
	
	/** Constructor */
	public Rectangle(double side1, double side2)
	{
		this.side1 = side1;
		this.side2 = side2;
	}
	
	/** Override method findArea in GeometricObject */
	@Override
	public double getArea() 
	{
		
		return side1 * side2;
	}
	/** Override method findPerimeter in GeometricObject */
	@Override
	public double getPerimeter() 
	{
		
		return 2 * (side1 + side2);
	}

}
