import java.lang.Math.*;

public class Sphere { // Class declaration
    private float radius; // Fields

    public Sphere(int startRadius) {
	// Constructor
	radius = startRadius;
    }

    void caluclateVolume(){

	double volume = 4/3 * Math.PI * radius * radius * radius;

	System.out.println("Volume is " + volume + ".");
    }

   /*void heightContactPoint(Sphere secondSphere){

	float r1 = radius;
	float r2 = secondSphere.radius;
	float height = r1*r2/(r1+r2);

	System.out.println("Height is " + height + ".");
    }*/
    
} 


class TestSphere{

    public static void main(String[] args){

	Sphere sphere1 = new Sphere(10);
	Sphere sphere2 = new Sphere(10);
	Sphere sphere3 = new Sphere(30);

	sphere1.caluclateVolume();
	sphere2.caluclateVolume();
	sphere3.caluclateVolume();
	
	/*   sphere1.heightContactPoint(Sphere sphere2);
	sphere1.heightContactPoint(Sphere sphere3);
	sphere2.heightContactPoint(Sphere sphere3);	*/

    }
}
	
