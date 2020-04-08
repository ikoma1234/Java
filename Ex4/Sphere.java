import java.lang.Math.*;

public class Sphere { // Class declaration
    private float radius; // Fields

    public Sphere(float startRadius) {
	// Constructor
	radius = startRadius;
    }

    void caluclateVolume(){

	double volume = 4/3 * Math.PI * radius * radius * radius;

	System.out.println("Radius " + radius + ": Volume is " + volume + ".");
    }

    void heightContactPoint(Sphere secondSphere){

	float r1 = radius;
	float r2 = secondSphere.radius;
	float height = 2 * (r1*r2/(r1+r2));

	System.out.println("Radius " + r1 + " and radius " + r2 + ": Height is " + height + ".");
    }
    
} 


class TestSphere{

    public static void main(String[] args){

	Sphere sphere1 = new Sphere(2.2f);
	Sphere sphere2 = new Sphere(2.2f);
	Sphere sphere3 = new Sphere(3.134f);

	sphere1.caluclateVolume();
	sphere2.caluclateVolume();
	sphere3.caluclateVolume();

	sphere1.heightContactPoint(sphere2);
	sphere1.heightContactPoint(sphere3);
	sphere2.heightContactPoint(sphere3);	

    }
}

	
