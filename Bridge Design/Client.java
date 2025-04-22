package Bridge;

public class Client {

	public static void main(String[] args) {
		Remote myRemote = new UniversalRemote(new SonyTV());
		myRemote.on();
		myRemote.setChannel(10);
		if (myRemote instanceof UniversalRemote) {
		((UniversalRemote) myRemote).nextChannel();
		}
		myRemote.off();
		
		myRemote = new UniversalRemote(new SamsungTV());
		myRemote.on();
		myRemote.setChannel(5);
		if (myRemote instanceof UniversalRemote) {
			((UniversalRemote) myRemote).nextChannel();
			}
		myRemote.off();

		myRemote = new GenericRemote(new ToshibaTV());
		myRemote.on();
		myRemote.setChannel(15);
		if (myRemote instanceof UniversalRemote) {
			((UniversalRemote) myRemote).nextChannel();
			}
		myRemote.off();

	}

}
