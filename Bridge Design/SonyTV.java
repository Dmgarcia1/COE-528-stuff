package Bridge;

public class SonyTV extends TV{


	@Override
	public void activate() {
		System.out.println("Sony TV activated");

	}

	@Override
	public void deactivate() {
		System.out.println("Sony TV deactivated");

	}

	@Override
	public void tune(int channel) {
		System.out.println("Sony TV set to channel " + channel);
		setStation(channel);

	}
}
