class Vehicle {
	private String engine;
	private int wheels;
	private int seats;
	private int fueTank;
	private String lights;
	
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
		this.engine = "petrol";
		this.wheels = 4;
		this.seats = 4;
		this.fueTank = 35;
		this.lights = "LED";
	}
	public Vehicle(String engine, int wheels, int seats, int fueTank, String lights) {
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fueTank = fueTank;
		this.lights = lights;
	}
	
	public String getEngine() {
		return engine;
	}
 
	public int getWheels() {
		return wheels;
	}
 
	public int getSeats() {
		return seats;
	}
 
	public int getFueTank() {
 
		return fueTank;
	}
 
	public String getLights() {
		return lights;
	}
	public void run() {
		System.out.println( "Running vehicle");
	}

}
 
class Bike extends Vehicle  {
	private String handle;

	public Bike() {
	super();
		this.handle = "short";
	}
 
	public Bike(String handle,String engine, int wheels, int seats, int fueTank, String lights) 
	{
	super( engine,  wheels,  seats,  fueTank,  lights);
		this.handle = handle;
	}
 
	public String getHandle() {
		return handle;
	}

	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFueTank()=" + getFueTank() + ", getLights()=" + getLights()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	
	public void run() {
		super.run();
		System.out.println( "Running Bike");
		System.out.println(toString());
	}
	
	
	
	}


class Car1 extends Vehicle 
{
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String fridge;
	private String entertainmentSystem;
}


 class Truck extends Vehicle {
	 private String steering;
	 private String musicsystem;
	 private String airConditioner;
	 private String container;
	}
 
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike("long","Diesel",4,4,45,"LED");

		//System.out.println(bike);
	
		bike.run();

	}

}
