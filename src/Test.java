/* Fiona Ibhazoboa
 * 0597605
 * Program to print out objects in an array.
 */
public class Test 
{
	//This is the main program. It instantiates the objects and sets their parameters. 
	//and it does this within the array.
	public static void main(String[] arg) 
	{
		GeometricObject gObjectArray [] = new GeometricObject [5];
		gObjectArray [0] = new Circle(5,5,5);
		gObjectArray [1] = new EquilateralTriangle(5,5,5);
		gObjectArray [2] = new Triangle(5,5,5);
		gObjectArray [3] = new Rectangle(5,5);
		gObjectArray [4] = new Square(5,5);
		
		// calls on the method that prints out the area and parameter of each object.
		 printAreaAndPerimeter(gObjectArray);
		
	}
	
	//This method searches through the array Geometric object and prints out the area and parameter in the objects.
	private static void printAreaAndPerimeter(GeometricObject[] gObject) 
	{
		   for (int i = 0; i < gObject.length; i++)
		   {
			   double a = gObject[i].getArea();
			   double p = gObject[i].getPerimeter();
			   
			   System.out.println("The area of this object is: " + a);
			   System.out.println("The perimeter of this object is: " + p);
			   System.out.println("\n");
			   
		   }
	}
		


}
