import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

interface Shape {
    void getArea();
}
    
class Shapei implements Shape {
    private String name;

    double perimeter, area;
    
    public Shapei(String name) {
	this.name = name;
    }
    public Shapei() {
	name = "no name";
    }
    public String getName() {
	return name;
    }
    public String toString() {
	return getClass().getName() + " " + name;
    }
    public void getArea(){
	System.out.println("Perimeter is: " + perimeter + ". Area is: " + area + ".");
    }
    
}
/*
class Point extends Shapei {
    private int x = 0;
    private int y = 0;
	// a constructor!
    Point(){}
    
    void getPoint(int sx, int sy){
        x = sx;
        y = sy;
    }
    // a method for moving the point
    public void move(int x, int y) {
	this.x = x;
	this.y = y;
    }

    public void getArea(){

	perimeter = 0;
	area = 0;

	System.out.println("Point:" + x + "," + y + ".");
	System.out.println("Perimeter is: " + perimeter + ". Area is: " + area + ".");
    }
}
*/

class Circle extends Shapei {

    double radius;

    Circle(){}

    void getRadius(double startRadius){
	radius = startRadius;
    }

    public void getArea(){
	perimeter = 2*radius*Math.PI;
	area = radius*radius*Math.PI;

	System.out.println("Circle, Radius:" + radius + ".");
	System.out.println("Perimeter is: " + perimeter + ". Area is: " + area + ".");
    }
    
}

class Rectangle extends Shapei {

    double ab,bc,cd,da;

    Rectangle(){}

    void gerAdjacentSides(double startAB, double startBC){

	ab = startAB;
	bc = startBC;
	
        cd=ab;
	da=bc;
	
    }

    public void getArea(){
	perimeter = 2*(ab+bc);
	area = ab*bc;
	
	System.out.println("Rectangle. Sides:"+ ab + ", " + bc + ".");
	System.out.println("Perimeter is: " + perimeter + ". Area is: " + area + ".");
    }

}

class TestFigure{
    
    public static void main(String[] strings) {

	Random rand = new Random();
	int i;

	Point[] p;
	    
	p = new Point[5];

	for(i=0;i<3;i++){

	    p[i]=new Point();
	    p[i].getPoint(rand.nextInt(100),rand.nextInt(100));
	    p[i].getArea();
	}

	Rectangle[] r;
	    
	r = new Rectangle[5];
	    
	for(i=0;i<4;i++){

	    r[i]= new Rectangle();
	    r[i].gerAdjacentSides(rand.nextDouble(),rand.nextDouble());
	    r[i].getArea();
	}

	Circle[] c;
	    
	c = new Circle[5];
	    
	for(i=0;i<5;i++){

	    c[i]=new Circle();
	    c[i].getRadius(rand.nextDouble());
	    c[i].getArea();
	}	    
    }
}
