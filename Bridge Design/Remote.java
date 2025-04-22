package Bridge;

public abstract class Remote {
	protected TV tv;
	
	public Remote(TV tv) {
		this.tv = tv;
	}
	public void on() {
		tv.activate();
	}
	public void off() {
		tv.deactivate();
	}
	public void setChannel(int channel) {
		tv.tune(channel);
	}
	

}
