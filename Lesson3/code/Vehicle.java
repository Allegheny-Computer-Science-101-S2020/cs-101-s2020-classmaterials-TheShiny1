package p1;
public class Vehicle{ // parent class
	protected int maxCapacity;
	public Vehicle(){} // default constructor
	public Vehicle(int cap){
		maxCapacity = cap;
	}
	void printM1(){
		System.out.println("Vehicle");
	}
}
