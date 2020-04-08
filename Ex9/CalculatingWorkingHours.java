import java.util.Random;

class Employee {
   
    int h; // number of hours at work today
    int w; // hourly wage

    Employee(int h) { this.h = h; w = 0; }
    public int getH() { return h;};
    public int getW() { return w; };
    public void setH(int h) { this.h = h; }
    // abstract public void generateNumberHours();
    public int getDayPayment() { return w * h; };
     
}

class Regular extends Employee{

    Regular(int h){ super(h); w=2000;}
    
    // public void generateNumberHours();
        
}

class PartTime extends Employee{

    PartTime(int h){ super(h); w=1000;}


}

class Engineer extends Employee {

    Engineer(int h){ super(h); w=2500;}


}

class Manager extends Employee {

    Manager(int h){ super(h); w=2900;}


}

/* your code */
public class CalculatingWorkingHours {
    public static void main(String[] args) {
	Employee[] e;
	Random rand = new Random();
	e = new Employee[rand.nextInt(500)];
	for(int i = 0; i< e.length; i++) {
	    switch (rand.nextInt(4)) {
	    case 0:
		e[i] = new Regular(8+rand.nextInt(2));
		break;
	    case 1:
		e[i] = new PartTime(0+rand.nextInt(5));
		break;
	    case 2:
		e[i] = new Engineer(8+rand.nextInt(3));
		break;
	    case 3:
		e[i] = new Manager(6+rand.nextInt(6));
		break;
	    }
	}

	for(int i=0;i<10;i++){

	    int temp=1+rand.nextInt(e.length);

	    System.out.println(e[temp].getH() + "hours works and " + e[temp].getW() + "yen/hour wage equal " + e[temp].getDayPayment() + "yen paid.");

	}
	/* your code */
    } // the end of the main method

   
} 
