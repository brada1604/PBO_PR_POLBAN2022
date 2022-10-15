//************************************************************
// PaintThings.java //
//
// Computes the amount of paint needed to paint various
// things. Uses the amount method of the paint class which
// takes any Shape as a parameter.
//***********************************************************

package kasus_2;


public class PaintThings { 

	//----------------------------------------- 
	// Creates someshapes and a Paint object 
	// and prints the amount of paintneeded
	// to paint each shape.
	//-----------------------------------------
	
	public static void main (String[] args)
	{
		double coveraged;
		Paint _paint = new Paint(10);

		Shape deck = new Rectangle(20, 35);
		System.out.println(deck.toString());
		coveraged = _paint.amount(deck);
		System.out.println(coveraged + "\n");
		
		Shape bigBall = new Sphere(15);
		System.out.println(((Sphere)bigBall).toString());
		coveraged = _paint.amount(bigBall);
		System.out.println(coveraged + "\n");
		
		Shape tank = new Cylinder(10, 30);
		System.out.println(((Cylinder)tank).toString());
		coveraged = _paint.amount(tank);
		System.out.println(coveraged + "\n");
	}

}