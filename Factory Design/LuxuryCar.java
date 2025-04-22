package factory;

public class LuxuryCar extends Car {

	public LuxuryCar() {
		super("Luxury Car");
	}
	@Override
	public Gearbox makeGearbox() {
		return new Automatic();
	}

}
