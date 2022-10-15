//*****************************************
//
// Sphere.java //
//
// Represents a sphere.
//***************************************** 

package kasus_2;

public class Sphere extends Shape {
	private double radius; //radius in feet

    //----------------------------------
    // Constructor: Sets up the sphere.
    //----------------------------------
    public Sphere(double r)
    {
    	super("Sphere");
    	radius = r;
    } 

    //----------------------------------------- 
    // Returns thesurface area of the sphere.
    //----------------------------------------- 
    public double area()
    {
    	return 4*Math.PI*radius*radius;
    }

    //----------------------------------- 
   	// Returns the sphere as aString. 
    //----------------------------------- 
    public String toString()
    {
    	return super.toString() + " of radius " + radius; 
    }
}