public class Car {
	private String doors;
	private String engine;
	private String driver;
	public int speed;
	
	public Car() {
		doors = "closed";
		engine = "on";
		driver= "seated";
		speed = 10;
		
	}
	public Car(String doors, String engine) {
		this.doors = doors;
		this.engine = engine;
	}
 
	public Car(String doors, String engine, String drivers, int speed) {
		//super();
		this.doors = doors;
		this.engine = engine;
		this.driver = drivers;
		this.speed = speed;
	}
	
	
	public String getEngine() {
		return engine;
	}
	public String getDoors() {
		return doors;
	}
	public String getDriver() {
		return driver;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") 
				&& speed >0) {
			return "car is running";
		}else {
			return "car is not running";
		}
	}
}
