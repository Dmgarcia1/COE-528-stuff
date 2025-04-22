package Bridge;

public class UniversalRemote extends Remote{ 

	
	public UniversalRemote(TV tv) {
		super(tv);
		// TODO Auto-generated constructor stub
	}

	public void nextChannel() {
		super.setChannel(tv.getStation() + 1);
	}

}
