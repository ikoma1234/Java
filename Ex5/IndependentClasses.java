class Rectangle {

    int height;
    int length;

    public Rectangle(int startHeight, int startLength){

	this.height = startHeight;
	this.length = startLength;	
  
    }

    public void calPerimeter(){

	int perimeter = 2*(height + length);

	System.out.println("Perimeter is " + perimeter + ".");

    }

}

class Box {

    int height, length, width;

    public Box(int startHeight, int startLength, int startWidth){

	height = startHeight;
	length = startLength;
	width = startWidth;
  
    }

    public void calPerimeter(){

	int perimeter = 4*(length+height+width);
        
	System.out.println("Perimeter is " + perimeter + ".");

    }

}

class IndependentClasses{

     public static void main(String[] strings) {

	 Rectangle r1 = new Rectangle(1,2);
	 Box b1 = new Box(1,2,3);

	 r1.calPerimeter();
	 b1.calPerimeter();

     }
    
}
