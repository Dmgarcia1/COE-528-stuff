package Bridge;

public class ToshibaTV extends TV {

	@Override
	public void activate() {
		System.out.println("Toshiba TV activated");

	}

	@Override
	public void deactivate() {
		System.out.println("Toshiba TV deactivated");

	}

	@Override
	public void tune(int channel) {
		System.out.println("Toshiba TV set to channel " + channel);
		setStation(channel);

	}

}
