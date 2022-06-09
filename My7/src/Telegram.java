
public class Telegram extends Messenger {

	@Override
	public void sendMessage() {
		System.out.println("send in Tel");
		
	}

	@Override
	public void getMessage() {
		System.out.println("rcvd in Tel");
		
	}

}
