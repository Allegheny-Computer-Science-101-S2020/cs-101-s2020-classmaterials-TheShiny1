package p2;
import p1.Vehicle;
class Car extends Vehicle{ // child class
	protected int maxCapacity;
	Car(){} // default constructor
	Car(int cap){
		super(12);
		maxCapacity = cap;
	}
	public void printInfo(){
		System.out.println("Vehicle:" + super.maxCapacity);
		System.out.println("Car:" + this.maxCapacity);
	}

	public void printM1(){
		System.out.println("M1.Car");
	}

	public void printM2(){
		System.out.println("M2.Car");
	}
}
