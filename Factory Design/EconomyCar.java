package factory;

public class EconomyCar extends Car {

	public EconomyCar() {
		super("Economy Car");
	}
	@Override
	public Gearbox makeGearbox() {
		return new Manual();
	}

}
