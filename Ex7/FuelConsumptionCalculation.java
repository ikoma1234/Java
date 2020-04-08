class FuelConsumptionCalculation {
    
   private double fuelConsumptionOldRegulation = 0;
   private double fuelConsumptionNewRegulation = 0;
   private SimpleCar[] cars;

    public double workbegan,workend,traveledkm,passengerhours;

    double kperl;
    double hperl;

   FuelConsumptionCalculation() {

   }
   FuelConsumptionCalculation(SimpleCar[] cars) {
   
      // your code is here 
   }
   private void calculateFuelConsumption() {

       System.out.println("Old regulation is "+ getFuelConsumptionOldRegulations() +". New regulation is "+getFuelConsumptionNewRegulations()+".");
	   
      // your code to calculate values of
       // fuelConsumptionOldRegulation and
       // fuelConsumptionNewRegulation is here 
   }
    double getFuelConsumptionOldRegulations() {

	return (traveledkm/kperl+(workend-workbegan)/hperl);
	// your code is here 
    }
    double getFuelConsumptionNewRegulations() {

	return (traveledkm/kperl+passengerhours/hperl);
	// your code is here
    }
    
} 


class SimpleCar{

    public double workbegan,workend,traveledkm,passengerhours;

    double kperl;
    double hperl;

    public void Setname(String name){
	if(name=="Honda"){
	    kperl=14;
	    hperl=15.5;
	}
	else if(name=="Toyota"){
	    kperl=15.5;
	    hperl=9.5;
	}
	else if(name=="Nissan"){
	    kperl=13;
	    hperl=-1;
	}
	else if(name=="Van"){
	    kperl=10.5;
	    hperl=6;
	}
    }
	
    public void Setworkbegan(double startworkbegan){
	workbegan=startworkbegan;
    }
    public void Setworkend(double startworkend){
	workend=startworkend;	
    }
    public void Settraveledkm(double starttraveledkm){
	traveledkm=starttraveledkm;
    }
    public void Setpassengerhours(double startpassengerhours){
	passengerhours=startpassengerhours;
    }
	

    double calculateFuelConsumption(){

	return traveledkm/kperl;
	
    }

    void print(){

	System.out.println("Fuel consumption is "+ calculateFuelConsumption() +".");

    }
          
}

class AdvancedCar extends SimpleCar{

    double calculateFuelConsumption(){

	return traveledkm/kperl+passengerhours/hperl;

    }

}

class DeluxeCar extends AdvancedCar{

    double calculateFuelConsumption(){

	return traveledkm/kperl+(workend-workbegan)/hperl;
	
    }

}

class CarDemo{

    public static void main(String[] args){


	/*
	DeluxeCar test = new DeluxeCar();

	test.Setname("Toyota");
	test.Setworkbegan(1.0);
	test.Setworkend(4.0);
	test.Settraveledkm(3.0);
	test.Setpassengerhours(2.0);

	test.print();

	AdvancedCar test2=test;

	test2.print();

	SimpleCar test3=test;

	test3.print(); */

	m(new SimpleCar(),"Toyota",3.0,6.0,2.0,1.0);
	m(new AdvancedCar(),"Toyota",3.0,6.0,2.0,1.0);
	m(new DeluxeCar(),"Toyota",3.0,6.0,2.0,1.0);

    }

    public static void m(SimpleCar x, String name, double a, double b, double c, double d){

	x.Setname(name);
	x.Setworkbegan(a);
	x.Setworkend(b);
	x.Settraveledkm(c);
	x.Setpassengerhours(d);

	x.print();
    }

}

