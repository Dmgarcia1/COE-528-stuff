package Bridge;

public abstract class TV {
	
	private int channel = 0;
	
	public abstract void activate();
	public abstract void deactivate();

	public abstract void tune(int tune);
	
	public int getStation() {
		return this.channel;
	}
	public void setStation(int channel) {
		this.channel=channel;
	}
	
}
