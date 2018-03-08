
public class Circle extends GeometricObject
{
	double x, y, radius;
	double pi = Math.PI;
	
	/** Constructor */
	public Circle()
	{
		x = 0;
		y = 0;
		radius = 1;
	}
	/** Constructor */
	public Circle (double x, double y, double radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	/* gets the value for X*/
	public double getX()
	{
		return x;
	}
	/* gets the value for Y*/
	public double getY()
	{
		return y;
	}
	/* gets the value for radius*/
	public double getRadius()
	{
		return radius;
	}
	
	/** Override method findArea in GeometricObject */
	@Override
	public double getArea() 
	{
		return pi * Math.pow(radius, 2);
	}
	
	/** Override method findPerimeter in GeometricObject */
	@Override
	public double getPerimeter() 
	{
		return 2 * pi * radius;
	}

}
