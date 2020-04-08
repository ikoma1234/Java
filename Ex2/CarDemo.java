class Car {
    int hoursePower = 0;
    int speed = 0;
    int fuelConsumption = 1;
    int gasTank = 0;
    int travelledTime = 0;
    
    Car() {
	hoursePower = 1;
	speed = 0;
	fuelConsumption = 1;
	gasTank = 1;
	travelledTime = 0;
    }
    
    void changehoursePower(int newValue){
	hoursePower = newValue;
    }
    void changefuelConsumption(int newValue){
	fuelConsumption = newValue;
    }
    void changegastank(int newValue){
	gasTank = newValue;
    }
    void speedUp(int increment){
	speed = speed + increment;
    }
    void applyBrakes(int decrement){
	speed = speed - decrement;
    }
    void travelledTimeUp(int increment){
	travelledTime = travelledTime + increment;
    }
    void printStates(){
	System.out.println("hoursePower:" + hoursePower + " speed:" + speed + " fuelConsumption:" + fuelConsumption + " gasTank:" + gasTank + " travelledTime:" + travelledTime );
    }
}

class CarDemo{
    public static void main(String[] args){

	Car car1 = new Car();
	Car car2 = new Car();
	Car car3 = new Car();
	    
	car1.speedUp(10);
	car1.printStates();
	car2.changefuelConsumption(2);
	car2.changegastank(3);
	car2.printStates();
	car3.travelledTimeUp(12);
	car3.printStates();
    }
}
