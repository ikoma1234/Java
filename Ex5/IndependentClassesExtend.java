class Rectangle{

    public int height;
    public int length;

    void setRectangle(int startHeight, int startLength){

	this.height = startHeight;
	this.length = startLength;	
  
    }

    public void calPerimeter(){

	int perimeter = 2*(height + length);

	System.out.println("Perimeter is " + perimeter + ".");

    }

}

class Box extends Rectangle{

    int width;

    void setBox(int startHeight, int startLength, int startWidth){

	this.height = startHeight;
	this.length = startLength;
	this.width = startWidth;
  
    }

    public void calPerimeter(){

	int perimeter = 4*(length+height+width);
        
	System.out.println("Perimeter is " + perimeter + ".");

    }

}

class IndependentClassesExtend{

    public static void main(String[] strings) {

	Rectangle r1 = new Rectangle();
	Box b1 = new Box();

	r1.setRectangle(1,2);
	b1.setBox(1,2,3);

	r1.calPerimeter();
	b1.calPerimeter();

    }
    
}
