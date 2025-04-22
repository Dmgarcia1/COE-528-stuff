package Bridge;

public class SamsungTV extends TV {


	@Override
	public void activate() {
		System.out.println("Samsung TV activated");

	}

	@Override
	public void deactivate() {
		System.out.println("Samsung TV deactivated");

	}

	@Override
	public void tune(int channel) {
		System.out.println("Samsung TV set to channel " + channel);
		setStation(channel);

	}

}
