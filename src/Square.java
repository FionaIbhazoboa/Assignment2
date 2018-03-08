
public class Square extends Rectangle 
{
	double side;
	
	/** Constructor */
	public Square(double side1, double side2)
	{
		//passes the value of side into rectangle constructor 
		super(side1, side2);
		this.side = side1;
	}
	
	/** Override method findArea in GeometricObject */
	@Override
	public double getArea() 
	{
		
		return side * side;
	}
	
	/** Override method findPerimeter in GeometricObject */
	@Override
	public double getPerimeter() 
	{
		
		return 4 * side;
	}

}
