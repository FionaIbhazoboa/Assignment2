
public class EquilateralTriangle extends Triangle 
{
	double side;
	
	/** Constructor */
	public EquilateralTriangle(double side1, double side2, double side3)
	{
		//passes the value of side into triangle constructor
		super(side1, side2, side3);
		this.side = side1;
	}
	
}
