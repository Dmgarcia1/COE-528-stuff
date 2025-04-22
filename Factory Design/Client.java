package factory;

public class Client {
	public static void main(String[] args) {
		Car c = new LuxuryCar();
		c.sellCar();
		
		c = new EconomyCar();
		c.sellCar();
	}
}
