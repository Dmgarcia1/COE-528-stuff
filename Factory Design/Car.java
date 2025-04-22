package factory;

public abstract class Car {
	public String type;
	
	public Car(String type) {
		this.type=type;
	}
	
	public void sellCar() {
		Gearbox gears = makeGearbox();
		System.out.println("Sold car of type: "+ type + " with " + gears.getName());
	}
	
	public abstract Gearbox makeGearbox();
}
